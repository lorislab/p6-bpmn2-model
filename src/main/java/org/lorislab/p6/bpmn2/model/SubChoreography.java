package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class SubChoreography extends ChoreographyActivity {

    private final List<Artifact> artifact = new ArrayList<>();

    private final List<FlowElement<?>> flowElement = new ArrayList<>();

    public SubChoreography() {
        super(FlowElementClass.SUB_CHOREOGRAPHY);
    }

    public List<Artifact> getArtifact() {
        return artifact;
    }

    public List<FlowElement<?>> getFlowElement() {
        return flowElement;
    }
}
