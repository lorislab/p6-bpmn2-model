package org.lorislab.p6.bpmn2.model;

public class StartEvent extends CatchEvent {

    private boolean isInterrupting;

    public StartEvent() {
        super(FlowElementClass.START_EVENT);
    }

    public boolean isInterrupting() {
        return isInterrupting;
    }

    public void setInterrupting(boolean interrupting) {
        isInterrupting = interrupting;
    }
}
