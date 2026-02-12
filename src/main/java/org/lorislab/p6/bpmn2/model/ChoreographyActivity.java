package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ChoreographyActivity extends FlowNode<ExtensionElements> {

    private final List<String> participantRef = new ArrayList<>();

    private final List<CorrelationKey> correlationKey = new ArrayList<>();

    private String initiatingParticipantRef;

    private ChoreographyLoopType loopType;

    protected ChoreographyActivity(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public enum ChoreographyLoopType {
        None,
        Standard,
        MultiInstanceSequential,
        MultiInstanceParallel;
    }

    public List<String> getParticipantRef() {
        return participantRef;
    }

    public List<CorrelationKey> getCorrelationKey() {
        return correlationKey;
    }

    public String getInitiatingParticipantRef() {
        return initiatingParticipantRef;
    }

    public void setInitiatingParticipantRef(String initiatingParticipantRef) {
        this.initiatingParticipantRef = initiatingParticipantRef;
    }

    public ChoreographyLoopType getLoopType() {
        return loopType;
    }

    public void setLoopType(ChoreographyLoopType loopType) {
        this.loopType = loopType;
    }
}
