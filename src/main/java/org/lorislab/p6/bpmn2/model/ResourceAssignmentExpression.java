package org.lorislab.p6.bpmn2.model;

public class ResourceAssignmentExpression extends BaseElement<ExtensionElements> {

    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
