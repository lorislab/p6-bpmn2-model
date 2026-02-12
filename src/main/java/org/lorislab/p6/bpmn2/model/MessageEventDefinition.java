package org.lorislab.p6.bpmn2.model;

public class MessageEventDefinition extends EventDefinition {

    private String messageRef;

    private String operationRef;

    public MessageEventDefinition() {
        super(EventDefinitionClass.MESSAGE_EVENT_DEFINITION);
    }

    public String getMessageRef() {
        return messageRef;
    }

    public void setMessageRef(String messageRef) {
        this.messageRef = messageRef;
    }

    public String getOperationRef() {
        return operationRef;
    }

    public void setOperationRef(String operationRef) {
        this.operationRef = operationRef;
    }
}
