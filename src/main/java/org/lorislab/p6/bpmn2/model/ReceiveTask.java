package org.lorislab.p6.bpmn2.model;

public class ReceiveTask extends Task<ExtensionElements> {

    private String implementation;

    private boolean instantiate;

    private String messageRef;

    private String operationRef;

    public ReceiveTask() {
        super(FlowElementClass.RECEIVE_TASK);
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public boolean isInstantiate() {
        return instantiate;
    }

    public void setInstantiate(boolean instantiate) {
        this.instantiate = instantiate;
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
