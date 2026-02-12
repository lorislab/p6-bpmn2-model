package org.lorislab.p6.bpmn2.model;

public class AdHocSubProcess extends SubProcess {

    private boolean cancelRemainingInstances;

    private AdHocOrdering ordering;

    private Expression completionCondition;

    public AdHocSubProcess() {
        super(FlowElementClass.AD_HOC_SUB_PROCESS);
    }

    public enum AdHocOrdering {
        Parallel,
        Sequential;
    }

    public boolean isCancelRemainingInstances() {
        return cancelRemainingInstances;
    }

    public void setCancelRemainingInstances(boolean cancelRemainingInstances) {
        this.cancelRemainingInstances = cancelRemainingInstances;
    }

    public AdHocOrdering getOrdering() {
        return ordering;
    }

    public void setOrdering(AdHocOrdering ordering) {
        this.ordering = ordering;
    }

    public Expression getCompletionCondition() {
        return completionCondition;
    }

    public void setCompletionCondition(Expression completionCondition) {
        this.completionCondition = completionCondition;
    }
}
