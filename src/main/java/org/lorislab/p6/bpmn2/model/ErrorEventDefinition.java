package org.lorislab.p6.bpmn2.model;

public class ErrorEventDefinition extends EventDefinition {

    private String errorRef;

    public ErrorEventDefinition() {
        super(EventDefinitionClass.ERROR_EVENT_DEFINITION);
    }

    public String getErrorRef() {
        return errorRef;
    }

    public void setErrorRef(String errorRef) {
        this.errorRef = errorRef;
    }
}
