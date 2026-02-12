package org.lorislab.p6.bpmn2.model;

import static org.lorislab.p6.bpmn2.model.FlowElement.FlowElementClass.CHOREOGRAPHY_TASK;

import java.util.ArrayList;
import java.util.List;

public class ChoreographyTask extends ChoreographyActivity {

    private final List<String> messageFlowRef = new ArrayList<>();

    public ChoreographyTask() {
        super(CHOREOGRAPHY_TASK);
    }

    public List<String> getMessageFlowRef() {
        return messageFlowRef;
    }

}
