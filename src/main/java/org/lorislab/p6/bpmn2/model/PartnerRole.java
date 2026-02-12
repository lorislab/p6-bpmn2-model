package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class PartnerRole extends RootElement<ExtensionElements> {

    private String name;

    private final List<String> participantRef = new ArrayList<>();

    public PartnerRole() {
        super(RootElementClass.PARTNER_ROLE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParticipantRef() {
        return participantRef;
    }

}
