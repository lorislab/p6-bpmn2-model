package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class SubConversation extends ConversationNode {

    private final List<ConversationNode> conversationMode = new ArrayList<>();

    public SubConversation() {
        super(ConversationNodeClass.SUB_CONVERSATION);
    }

    public List<ConversationNode> getConversationMode() {
        return conversationMode;
    }

}
