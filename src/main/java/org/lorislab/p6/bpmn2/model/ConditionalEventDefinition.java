package org.lorislab.p6.bpmn2.model;

public class ConditionalEventDefinition extends EventDefinition {

    private Expression condition;

    public ConditionalEventDefinition() {
        super(EventDefinitionClass.CONDITIONAL_EVENT_DEFINITION);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
