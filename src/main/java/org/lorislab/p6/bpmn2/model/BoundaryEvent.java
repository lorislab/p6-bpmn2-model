package org.lorislab.p6.bpmn2.model;

public class BoundaryEvent extends CatchEvent {

    private boolean cancelActivity;

    private String attachedToRef;

    public BoundaryEvent() {
        super(FlowElementClass.BOUNDARY_EVENT);
    }

    public boolean isCancelActivity() {
        return cancelActivity;
    }

    public void setCancelActivity(boolean cancelActivity) {
        this.cancelActivity = cancelActivity;
    }

    public String getAttachedToRef() {
        return attachedToRef;
    }

    public void setAttachedToRef(String attachedToRef) {
        this.attachedToRef = attachedToRef;
    }
}
