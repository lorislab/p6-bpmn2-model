package org.lorislab.p6.bpmn2.model;

public class ComplexBehaviorDefinition extends BaseElement<ExtensionElements> {

    private FormalExpression condition;

    private ImplicitThrowEvent event;

    public FormalExpression getCondition() {
        return condition;
    }

    public void setCondition(FormalExpression condition) {
        this.condition = condition;
    }

    public ImplicitThrowEvent getEvent() {
        return event;
    }

    public void setEvent(ImplicitThrowEvent event) {
        this.event = event;
    }
}
