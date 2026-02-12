package org.lorislab.p6.bpmn2.model;

public class Assignment extends BaseElement<ExtensionElements> {

    private Expression from;

    private Expression to;

    public Expression getFrom() {
        return from;
    }

    public void setFrom(Expression from) {
        this.from = from;
    }

    public Expression getTo() {
        return to;
    }

    public void setTo(Expression to) {
        this.to = to;
    }
}
