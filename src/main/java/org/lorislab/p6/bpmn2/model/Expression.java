package org.lorislab.p6.bpmn2.model;

public class Expression extends BaseElementWithMixedContent {

    private final ExpressionClass expressionClass;

    public Expression() {
        this.expressionClass = ExpressionClass.EXPRESSION;
    }

    public Expression(ExpressionClass expressionClass) {
        this.expressionClass = expressionClass;
    }

    public ExpressionClass getExpressionClass() {
        return expressionClass;
    }

    public enum ExpressionClass {

        EXPRESSION,
        FORMAL_EXPRESSION;
    }
}
