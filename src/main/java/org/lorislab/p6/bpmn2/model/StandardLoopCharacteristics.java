package org.lorislab.p6.bpmn2.model;

public class StandardLoopCharacteristics extends LoopCharacteristics {

    private Integer loopMaximum;

    private boolean testBefore;

    private Expression loopCondition;

    public StandardLoopCharacteristics() {
        super(LoopCharacteristicsClass.STANDARD_LOOP_CHARACTERISTICS);
    }

    public Integer getLoopMaximum() {
        return loopMaximum;
    }

    public void setLoopMaximum(Integer loopMaximum) {
        this.loopMaximum = loopMaximum;
    }

    public boolean isTestBefore() {
        return testBefore;
    }

    public void setTestBefore(boolean testBefore) {
        this.testBefore = testBefore;
    }

    public Expression getLoopCondition() {
        return loopCondition;
    }

    public void setLoopCondition(Expression loopCondition) {
        this.loopCondition = loopCondition;
    }
}
