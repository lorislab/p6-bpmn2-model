package org.lorislab.p6.bpmn2.model;

public class Transaction extends SubProcess {

    private String method;

    public Transaction() {
        super(FlowElementClass.TRANSACTION);
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
