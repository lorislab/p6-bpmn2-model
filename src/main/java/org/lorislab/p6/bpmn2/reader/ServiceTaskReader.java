package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;
import static org.lorislab.p6.bpmn2.reader.Readers.SERVICE_TASK_EXTENSION_ELEMENTS_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ServiceTask;

public class ServiceTaskReader extends ActivityReader<ServiceTask> {
    public ServiceTaskReader() {
        super(ServiceTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##WebService"));
        // operationRef
        element.setOperationRef(attrs.getString(ATTR_OPERATION_REF));
    }

    @Override
    protected void readExtensionElements(XMLStreamReader2 reader, ServiceTask element) throws Exception {
        readElementSequenceItem(SERVICE_TASK_EXTENSION_ELEMENTS_READER, reader, ELEMENT_EXTENSIONS_ELEMENTS,
                element::setExtensionElements);
    }
}
