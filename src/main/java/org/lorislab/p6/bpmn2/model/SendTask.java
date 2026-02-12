package org.lorislab.p6.bpmn2.model;

public class SendTask extends Task<ExtensionElements> {

    private String implementation;

    private String messageRef;

    private String operationRef;

    public SendTask() {
        super(FlowElementClass.SEND_TASK);
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
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
