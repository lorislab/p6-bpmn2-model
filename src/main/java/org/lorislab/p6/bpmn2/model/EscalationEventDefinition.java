package org.lorislab.p6.bpmn2.model;

public class EscalationEventDefinition extends EventDefinition {

    private String escalationRef;

    public EscalationEventDefinition() {
        super(EventDefinitionClass.ESCALATION_EVENT_DEFINITION);
    }

    public String getEscalationRef() {
        return escalationRef;
    }

    public void setEscalationRef(String escalationRef) {
        this.escalationRef = escalationRef;
    }
}
