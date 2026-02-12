package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CallConversation extends ConversationNode {

    private String calledCollaborationRef;

    private final List<ParticipantAssociation> participantAssociation = new ArrayList<>();

    public CallConversation() {
        super(ConversationNodeClass.CALL_CONVERSATION);
    }

    public List<ParticipantAssociation> getParticipantAssociation() {
        return participantAssociation;
    }

    public String getCalledCollaborationRef() {
        return calledCollaborationRef;
    }

    public void setCalledCollaborationRef(String calledCollaborationRef) {
        this.calledCollaborationRef = calledCollaborationRef;
    }
}
