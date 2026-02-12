package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.ZEEBE_SERVICE_TASK_PROPERTY_READER;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskPropertiesReader extends Reader<ServiceTaskExtensionElements.ZeebeProperties> {

    private static final QName ZEEBE_PROPERTY = new QName(ZEEBE_NAMESPACE_URI, "property");
    private static final String PROPERTY_EXAMPLE = "camundaModeler:exampleOutputJson";

    public ZeebeServiceTaskPropertiesReader() {
        super(ServiceTaskExtensionElements.ZeebeProperties::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ServiceTaskExtensionElements.ZeebeProperties> fn)
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
            if (ZEEBE_PROPERTY.equals(reader.getName())) {
                ZEEBE_SERVICE_TASK_PROPERTY_READER.read(reader, ZEEBE_PROPERTY.getLocalPart(), x -> {
                    if (PROPERTY_EXAMPLE.equals(x.getName())) {
                        element.setExample(x.getValue());
                    } else {
                        element.getProperties().add(x);
                    }
                });
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }

        }
        fn.accept(element);
        return true;
    }
}
