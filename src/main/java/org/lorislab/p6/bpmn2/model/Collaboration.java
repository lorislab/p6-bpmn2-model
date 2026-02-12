package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Collaboration extends RootElement<ExtensionElements> {

    private String name;

    private boolean isClosed;

    private final List<Participant> participant = new ArrayList<>();

    private final List<MessageFlow> messageFlow = new ArrayList<>();

    // Artifact
    private final List<Artifact> artifact = new ArrayList<>();

    private final List<ConversationNode> conversationNode = new ArrayList<>();

    private final List<ConversationAssociation> conversationAssociation = new ArrayList<>();

    private final List<ParticipantAssociation> participantAssociation = new ArrayList<>();

    private final List<MessageFlowAssociation> messageFlowAssociation = new ArrayList<>();

    private final List<CorrelationKey> correlationKey = new ArrayList<>();

    private final List<String> choreographyRef = new ArrayList<>();

    private final List<ConversationLink> conversationLink = new ArrayList<>();

    public Collaboration() {
        super(RootElementClass.COLLABORATION);
    }

    public List<String> getChoreographyRef() {
        return choreographyRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public List<Artifact> getArtifact() {
        return artifact;
    }

    public List<Participant> getParticipant() {
        return participant;
    }

    public List<MessageFlow> getMessageFlow() {
        return messageFlow;
    }

    public List<ConversationNode> getConversationNode() {
        return conversationNode;
    }

    public List<ConversationAssociation> getConversationAssociation() {
        return conversationAssociation;
    }

    public List<ParticipantAssociation> getParticipantAssociation() {
        return participantAssociation;
    }

    public List<MessageFlowAssociation> getMessageFlowAssociation() {
        return messageFlowAssociation;
    }

    public List<CorrelationKey> getCorrelationKey() {
        return correlationKey;
    }

    public List<ConversationLink> getConversationLink() {
        return conversationLink;
    }
}
