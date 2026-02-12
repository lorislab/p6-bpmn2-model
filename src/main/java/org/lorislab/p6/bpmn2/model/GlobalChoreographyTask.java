package org.lorislab.p6.bpmn2.model;

public class GlobalChoreographyTask extends Choreography {

    private String initiatingParticipantRef;

    public String getInitiatingParticipantRef() {
        return initiatingParticipantRef;
    }

    public void setInitiatingParticipantRef(String initiatingParticipantRef) {
        this.initiatingParticipantRef = initiatingParticipantRef;
    }
}
