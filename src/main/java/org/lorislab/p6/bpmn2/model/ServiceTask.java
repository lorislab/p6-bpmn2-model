package org.lorislab.p6.bpmn2.model;

public class ServiceTask extends Task<ServiceTaskExtensionElements> {

    private String implementation;

    private String operationRef;

    public ServiceTask() {
        super(FlowElementClass.SERVICE_TASK);
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public String getOperationRef() {
        return operationRef;
    }

    public void setOperationRef(String operationRef) {
        this.operationRef = operationRef;
    }
}
