package org.lorislab.p6.bpmn2.model;

public class SequenceFlow extends FlowElement<ExtensionElements> {

    private String sourceRef;

    private String targetRef;

    private Boolean isImmediate;

    private Expression conditionExpression;

    public SequenceFlow() {
        super(FlowElementClass.SEQUENCE_FLOW);
    }

    protected SequenceFlow(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public Boolean isImmediate() {
        return isImmediate;
    }

    public void setImmediate(Boolean immediate) {
        isImmediate = immediate;
    }

    public Expression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(Expression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }
}
