package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Choreography extends Collaboration {

    private final List<FlowElement> flowElement = new ArrayList<>();

    public List<FlowElement> getFlowElement() {
        return flowElement;
    }
}
