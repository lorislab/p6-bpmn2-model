package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class EventDefinitionList {

    private final List<LinkEventDefinition> linkEventDefinition = new ArrayList<>();
    private final List<MessageEventDefinition> messageEventDefinition = new ArrayList<>();
    private final List<SignalEventDefinition> signalEventDefinition = new ArrayList<>();
    private final List<TerminateEventDefinition> terminateEventDefinition = new ArrayList<>();
    private final List<TimerEventDefinition> timerEventDefinition = new ArrayList<>();
    private final List<CancelEventDefinition> cancelEventDefinition = new ArrayList<>();
    private final List<CompensateEventDefinition> compensateEventDefinition = new ArrayList<>();
    private final List<ConditionalEventDefinition> conditionalEventDefinition = new ArrayList<>();
    private final List<ErrorEventDefinition> errorEventDefinition = new ArrayList<>();
    private final List<EscalationEventDefinition> escalationEventDefinition = new ArrayList<>();

    public List<LinkEventDefinition> getLinkEventDefinition() {
        return linkEventDefinition;
    }

    public List<MessageEventDefinition> getMessageEventDefinition() {
        return messageEventDefinition;
    }

    public List<SignalEventDefinition> getSignalEventDefinition() {
        return signalEventDefinition;
    }

    public List<TerminateEventDefinition> getTerminateEventDefinition() {
        return terminateEventDefinition;
    }

    public List<TimerEventDefinition> getTimerEventDefinition() {
        return timerEventDefinition;
    }

    public List<CancelEventDefinition> getCancelEventDefinition() {
        return cancelEventDefinition;
    }

    public List<CompensateEventDefinition> getCompensateEventDefinition() {
        return compensateEventDefinition;
    }

    public List<ConditionalEventDefinition> getConditionalEventDefinition() {
        return conditionalEventDefinition;
    }

    public List<ErrorEventDefinition> getErrorEventDefinition() {
        return errorEventDefinition;
    }

    public List<EscalationEventDefinition> getEscalationEventDefinition() {
        return escalationEventDefinition;
    }

}
