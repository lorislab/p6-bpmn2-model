package org.lorislab.p6.bpmn2.model;

public class Task<T extends ExtensionElements> extends Activity<T> {

    public Task() {
        super(FlowElementClass.TASK);
    }

    protected Task(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }
}
