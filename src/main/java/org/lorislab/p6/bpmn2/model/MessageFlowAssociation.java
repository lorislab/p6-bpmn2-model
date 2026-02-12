package org.lorislab.p6.bpmn2.model;

public class MessageFlowAssociation extends BaseElement<ExtensionElements> {

    private String innerMessageFlowRef;

    private String outerMessageFlowRef;

    public String getInnerMessageFlowRef() {
        return innerMessageFlowRef;
    }

    public void setInnerMessageFlowRef(String innerMessageFlowRef) {
        this.innerMessageFlowRef = innerMessageFlowRef;
    }

    public String getOuterMessageFlowRef() {
        return outerMessageFlowRef;
    }

    public void setOuterMessageFlowRef(String outerMessageFlowRef) {
        this.outerMessageFlowRef = outerMessageFlowRef;
    }
}
