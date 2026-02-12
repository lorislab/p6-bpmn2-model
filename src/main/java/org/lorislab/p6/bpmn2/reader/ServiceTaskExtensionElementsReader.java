package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ServiceTaskExtensionElementsReader extends Reader<ServiceTaskExtensionElements> {

    private static final QName ZEEBE_TASK_DEFINITION = new QName(ZEEBE_NAMESPACE_URI, "taskDefinition");
    private static final QName ZEEBE_TASK_HEADERS = new QName(ZEEBE_NAMESPACE_URI, "taskHeaders");
    private static final QName ZEEBE_IO_MAPPING = new QName(ZEEBE_NAMESPACE_URI, "ioMapping");
    private static final QName ZEEBE_PROPERTIES = new QName(ZEEBE_NAMESPACE_URI, "properties");
    private static final QName ZEEBE_EXECUTION_LISTENERS = new QName(ZEEBE_NAMESPACE_URI, "executionListeners");

    public ServiceTaskExtensionElementsReader() {
        super(ServiceTaskExtensionElements::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ServiceTaskExtensionElements> fn) throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }
        var element = createElement(reader, null);

        while (reader.hasNext()) {
            reader.nextTag();

            if (isEndElement(reader, name)) {
                break;
            }

            if (ZEEBE_TASK_DEFINITION.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_TASK_DEFINITION_READER.read(reader, ZEEBE_TASK_DEFINITION.getLocalPart(),
                        element::setZeebeTaskDefinition);
            } else if (ZEEBE_TASK_HEADERS.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_TASK_HEADERS_READER.read(reader, ZEEBE_TASK_HEADERS.getLocalPart(),
                        element::setZeebeTaskHeaders);
            } else if (ZEEBE_IO_MAPPING.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_IO_MAPPING_READER.read(reader, ZEEBE_IO_MAPPING.getLocalPart(), element::setZeebeIOMapping);
            } else if (ZEEBE_PROPERTIES.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_PROPERTIES_READER.read(reader, ZEEBE_PROPERTIES.getLocalPart(), element::setZeebeProperties);
            } else if (ZEEBE_EXECUTION_LISTENERS.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_EXECUTION_LISTENERS_READER.read(reader, ZEEBE_EXECUTION_LISTENERS.getLocalPart(),
                        element::setZeebeExecutionListeners);
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }
        }
        fn.accept(element);
        return true;
    }

}
