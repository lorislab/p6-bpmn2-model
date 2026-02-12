package org.lorislab.p6.bpmn2.model;

public class CallActivity extends Activity<ExtensionElements> {

    private String calledElement;

    public CallActivity() {
        super(FlowElementClass.CALL_ACTIVITY);
    }

    public String getCalledElement() {
        return calledElement;
    }

    public void setCalledElement(String calledElement) {
        this.calledElement = calledElement;
    }
}
