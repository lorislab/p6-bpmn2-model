package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class SubProcess extends Activity<ExtensionElements> {

    private boolean triggeredByEvent;

    private final List<LaneSet> laneSet = new ArrayList<>();

    private final List<FlowElement<?>> flowElement = new ArrayList<>();

    private final List<Artifact> artifact = new ArrayList<>();

    public SubProcess() {
        super(FlowElementClass.SUB_PROCESS);
    }

    protected SubProcess(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public boolean isTriggeredByEvent() {
        return triggeredByEvent;
    }

    public void setTriggeredByEvent(boolean triggeredByEvent) {
        this.triggeredByEvent = triggeredByEvent;
    }

    public List<LaneSet> getLaneSet() {
        return laneSet;
    }

    public List<FlowElement<?>> getFlowElement() {
        return flowElement;
    }

    public List<Artifact> getArtifact() {
        return artifact;
    }
}
