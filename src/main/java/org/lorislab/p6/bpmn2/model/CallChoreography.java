package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CallChoreography extends ChoreographyActivity {

    private String calledChoreographyRef;

    private final List<ParticipantAssociation> participantAssociation = new ArrayList<>();

    public CallChoreography() {
        super(FlowElementClass.CALL_CHOREOGRAPHY);
    }

    public String getCalledChoreographyRef() {
        return calledChoreographyRef;
    }

    public void setCalledChoreographyRef(String calledChoreographyRef) {
        this.calledChoreographyRef = calledChoreographyRef;
    }

    public List<ParticipantAssociation> getParticipantAssociation() {
        return participantAssociation;
    }

}
