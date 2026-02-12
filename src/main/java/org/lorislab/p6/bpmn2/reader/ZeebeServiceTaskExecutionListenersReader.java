package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.ZEEBE_SERVICE_TASK_EXECUTION_LISTENER_READER;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskExecutionListenersReader extends Reader<ServiceTaskExtensionElements.ZeebeExecutionListeners> {

    private static final QName ZEEBE_EXECUTION_LISTENER = new QName(ZEEBE_NAMESPACE_URI, "executionListener");

    public ZeebeServiceTaskExecutionListenersReader() {
        super(ServiceTaskExtensionElements.ZeebeExecutionListeners::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ServiceTaskExtensionElements.ZeebeExecutionListeners> fn)
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
            if (ZEEBE_EXECUTION_LISTENER.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_EXECUTION_LISTENER_READER.read(reader, ZEEBE_EXECUTION_LISTENER.getLocalPart(),
                        element.getListeners()::add);
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }

        }
        fn.accept(element);
        return true;
    }
}
