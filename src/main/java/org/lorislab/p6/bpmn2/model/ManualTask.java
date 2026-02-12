package org.lorislab.p6.bpmn2.model;

public class ManualTask extends Task<ExtensionElements> {
    public ManualTask() {
        super(FlowElementClass.MANUAL_TASK);
    }
}
