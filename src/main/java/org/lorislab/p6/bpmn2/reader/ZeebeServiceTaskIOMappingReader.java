package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskIOMappingReader extends Reader<ServiceTaskExtensionElements.ZeebeIOMapping> {

    private static final QName ZEEBE_INPUT = new QName(ZEEBE_NAMESPACE_URI, "input");
    private static final QName ZEEBE_OUTPUT = new QName(ZEEBE_NAMESPACE_URI, "output");

    public ZeebeServiceTaskIOMappingReader() {
        super(ServiceTaskExtensionElements.ZeebeIOMapping::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ServiceTaskExtensionElements.ZeebeIOMapping> fn)
            throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }
        var element = createElement(reader, null);

        while (reader.hasNext()) {
            reader.nextTag();

            if (isEndElement(reader, name)) {
                break;
            }
            if (ZEEBE_INPUT.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_IO_MAPPING_INPUT_READER.read(reader, ZEEBE_INPUT.getLocalPart(), element.getInput()::add);
            } else if (ZEEBE_OUTPUT.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_IO_MAPPING_OUTPUT_READER.read(reader, ZEEBE_OUTPUT.getLocalPart(), element.getOutput()::add);
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }

        }
        fn.accept(element);
        return true;
    }
}
