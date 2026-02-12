package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.SendTask;

public class SendTaskReader extends ActivityReader<SendTask> {

    public SendTaskReader() {
        super(SendTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, SendTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##WebService"));
        // messageRef
        element.setMessageRef(attrs.getString(AttributeReader.ATTR_MESSAGE_REF));
        // operationRef
        element.setOperationRef(attrs.getString(AttributeReader.ATTR_OPERATION_REF));
    }
}
