package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class MultiInstanceLoopCharacteristics extends LoopCharacteristics {

    private boolean isSequential;

    private MultiInstanceFlowCondition behavior;

    private String oneBehaviorEventRef;

    private String noneBehaviorEventRef;

    private Expression loopCardinality;

    private String loopDataInputRef;

    private String loopDataOutputRef;

    private DataInput inputDataItem;

    private DataOutput outputDataItem;

    private final List<ComplexBehaviorDefinition> complexBehaviorDefinition = new ArrayList<>();

    private Expression completionCondition;

    public MultiInstanceLoopCharacteristics() {
        super(LoopCharacteristicsClass.MULTI_INSTANCE_LOOP_CHARACTERISTICS);
    }

    public enum MultiInstanceFlowCondition {
        None,
        One,
        All,
        Complex;
    }

    public boolean isSequential() {
        return isSequential;
    }

    public void setSequential(boolean sequential) {
        isSequential = sequential;
    }

    public MultiInstanceFlowCondition getBehavior() {
        return behavior;
    }

    public void setBehavior(MultiInstanceFlowCondition behavior) {
        this.behavior = behavior;
    }

    public String getOneBehaviorEventRef() {
        return oneBehaviorEventRef;
    }

    public void setOneBehaviorEventRef(String oneBehaviorEventRef) {
        this.oneBehaviorEventRef = oneBehaviorEventRef;
    }

    public String getNoneBehaviorEventRef() {
        return noneBehaviorEventRef;
    }

    public void setNoneBehaviorEventRef(String noneBehaviorEventRef) {
        this.noneBehaviorEventRef = noneBehaviorEventRef;
    }

    public Expression getLoopCardinality() {
        return loopCardinality;
    }

    public void setLoopCardinality(Expression loopCardinality) {
        this.loopCardinality = loopCardinality;
    }

    public String getLoopDataInputRef() {
        return loopDataInputRef;
    }

    public void setLoopDataInputRef(String loopDataInputRef) {
        this.loopDataInputRef = loopDataInputRef;
    }

    public String getLoopDataOutputRef() {
        return loopDataOutputRef;
    }

    public void setLoopDataOutputRef(String loopDataOutputRef) {
        this.loopDataOutputRef = loopDataOutputRef;
    }

    public DataInput getInputDataItem() {
        return inputDataItem;
    }

    public void setInputDataItem(DataInput inputDataItem) {
        this.inputDataItem = inputDataItem;
    }

    public DataOutput getOutputDataItem() {
        return outputDataItem;
    }

    public void setOutputDataItem(DataOutput outputDataItem) {
        this.outputDataItem = outputDataItem;
    }

    public List<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return complexBehaviorDefinition;
    }

    public Expression getCompletionCondition() {
        return completionCondition;
    }

    public void setCompletionCondition(Expression completionCondition) {
        this.completionCondition = completionCondition;
    }
}
