package org.lorislab.p6.bpmn2.model;

public class SignalEventDefinition extends EventDefinition {

    private String signalRef;

    public SignalEventDefinition() {
        super(EventDefinitionClass.SIGNAL_EVENT_DEFINITION);
    }

    public String getSignalRef() {
        return signalRef;
    }

    public void setSignalRef(String signalRef) {
        this.signalRef = signalRef;
    }
}
