package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskTaskHeadersReader extends Reader<ServiceTaskExtensionElements.ZeebeTaskHeaders> {

    private static final QName ZEEBE_HEADER = new QName(ZEEBE_NAMESPACE_URI, "header");

    public ZeebeServiceTaskTaskHeadersReader() {
        super(ServiceTaskExtensionElements.ZeebeTaskHeaders::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ServiceTaskExtensionElements.ZeebeTaskHeaders> fn)
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
            if (ZEEBE_HEADER.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_TASK_HEADER_READER.read(reader, ZEEBE_HEADER.getLocalPart(), element.getHeaders()::add);
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }

        }
        fn.accept(element);
        return true;
    }
}
