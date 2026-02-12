package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.ReceiveTask;

public class ReceiveTaskReader extends ActivityReader<ReceiveTask> {

    public ReceiveTaskReader() {
        super(ReceiveTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ReceiveTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##WebService"));
        // instantiate
        element.setInstantiate(attrs.getBoolean(AttributeReader.ATTR_INSTANTIATE, false));
        // messageRef
        element.setMessageRef(attrs.getString(AttributeReader.ATTR_MESSAGE_REF));
        // operationRef
        element.setOperationRef(attrs.getString(AttributeReader.ATTR_OPERATION_REF));
    }
}
