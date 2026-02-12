package org.lorislab.p6.bpmn2.model;

public class CorrelationPropertyRetrievalExpression extends BaseElement<ExtensionElements> {

    private String messageRef;

    private FormalExpression messagePath;

    public String getMessageRef() {
        return messageRef;
    }

    public void setMessageRef(String messageRef) {
        this.messageRef = messageRef;
    }

    public FormalExpression getMessagePath() {
        return messagePath;
    }

    public void setMessagePath(FormalExpression messagePath) {
        this.messagePath = messagePath;
    }
}
