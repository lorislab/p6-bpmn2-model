package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Participant extends BaseElement<ExtensionElements> {

    private String name;

    private String processRef;

    private final List<String> interfaceRef = new ArrayList<>();

    private final List<String> endPointRef = new ArrayList<>();

    private ParticipantMultiplicity participantMultiplicity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessRef() {
        return processRef;
    }

    public void setProcessRef(String processRef) {
        this.processRef = processRef;
    }

    public List<String> getInterfaceRef() {
        return interfaceRef;
    }

    public List<String> getEndPointRef() {
        return endPointRef;
    }

    public ParticipantMultiplicity getParticipantMultiplicity() {
        return participantMultiplicity;
    }

    public void setParticipantMultiplicity(ParticipantMultiplicity participantMultiplicity) {
        this.participantMultiplicity = participantMultiplicity;
    }
}
