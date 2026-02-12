package org.lorislab.p6.bpmn2.model;

public class Escalation extends RootElement<ExtensionElements> {

    private String name;

    private String escalationCode;

    private String structureRef;

    public Escalation() {
        super(RootElementClass.ESCALATION);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEscalationCode() {
        return escalationCode;
    }

    public void setEscalationCode(String escalationCode) {
        this.escalationCode = escalationCode;
    }

    public String getStructureRef() {
        return structureRef;
    }

    public void setStructureRef(String structureRef) {
        this.structureRef = structureRef;
    }
}
