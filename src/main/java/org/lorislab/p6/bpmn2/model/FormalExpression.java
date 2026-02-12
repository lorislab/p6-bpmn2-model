package org.lorislab.p6.bpmn2.model;

public class FormalExpression extends Expression {

    private String language;

    private String evaluatesToTypeRef;

    public FormalExpression() {
        super(ExpressionClass.FORMAL_EXPRESSION);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEvaluatesToTypeRef() {
        return evaluatesToTypeRef;
    }

    public void setEvaluatesToTypeRef(String evaluatesToTypeRef) {
        this.evaluatesToTypeRef = evaluatesToTypeRef;
    }
}
