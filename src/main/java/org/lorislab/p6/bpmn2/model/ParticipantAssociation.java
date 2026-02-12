package org.lorislab.p6.bpmn2.model;

public class ParticipantAssociation extends BaseElement<ExtensionElements> {

    private String innerParticipantRef;

    private String outerParticipantRef;

    public String getInnerParticipantRef() {
        return innerParticipantRef;
    }

    public void setInnerParticipantRef(String innerParticipantRef) {
        this.innerParticipantRef = innerParticipantRef;
    }

    public String getOuterParticipantRef() {
        return outerParticipantRef;
    }

    public void setOuterParticipantRef(String outerParticipantRef) {
        this.outerParticipantRef = outerParticipantRef;
    }
}
