package org.lorislab.p6.bpmn2.model;

public class CompensateEventDefinition extends EventDefinition {

    private Boolean waitForCompletion;

    private String activityRef;

    public CompensateEventDefinition() {
        super(EventDefinitionClass.COMPENSATE_EVENT_DEFINITION);
    }

    public Boolean isWaitForCompletion() {
        return waitForCompletion;
    }

    public void setWaitForCompletion(Boolean waitForCompletion) {
        this.waitForCompletion = waitForCompletion;
    }

    public String getActivityRef() {
        return activityRef;
    }

    public void setActivityRef(String activityRef) {
        this.activityRef = activityRef;
    }
}
