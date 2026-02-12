package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ConversationNode extends BaseElement<ExtensionElements> {

    private final ConversationNodeClass conversationNodeClass;

    private String name;

    private final List<String> participantRef = new ArrayList<>();

    private final List<String> messageFlowRef = new ArrayList<>();

    private final List<CorrelationKey> correlationKey = new ArrayList<>();

    protected ConversationNode(ConversationNodeClass conversationNodeClass) {
        this.conversationNodeClass = conversationNodeClass;
    }

    public ConversationNodeClass getConversationNodeClass() {
        return conversationNodeClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParticipantRef() {
        return participantRef;
    }

    public List<String> getMessageFlowRef() {
        return messageFlowRef;
    }

    public List<CorrelationKey> getCorrelationKey() {
        return correlationKey;
    }

    public enum ConversationNodeClass {
        CONVERSATION,
        SUB_CONVERSATION,
        CALL_CONVERSATION;
    }
}
