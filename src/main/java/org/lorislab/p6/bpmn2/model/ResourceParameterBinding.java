package org.lorislab.p6.bpmn2.model;

public class ResourceParameterBinding extends BaseElement<ExtensionElements> {

    private String parameterRef;

    private Expression expression;

    public String getParameterRef() {
        return parameterRef;
    }

    public void setParameterRef(String parameterRef) {
        this.parameterRef = parameterRef;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
