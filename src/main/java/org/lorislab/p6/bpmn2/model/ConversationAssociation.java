package org.lorislab.p6.bpmn2.model;

public class ConversationAssociation extends BaseElement<ExtensionElements> {

    private String innerConversationNodeRef;

    private String outerConversationNodeRef;

    public String getInnerConversationNodeRef() {
        return innerConversationNodeRef;
    }

    public void setInnerConversationNodeRef(String innerConversationNodeRef) {
        this.innerConversationNodeRef = innerConversationNodeRef;
    }

    public String getOuterConversationNodeRef() {
        return outerConversationNodeRef;
    }

    public void setOuterConversationNodeRef(String outerConversationNodeRef) {
        this.outerConversationNodeRef = outerConversationNodeRef;
    }
}
