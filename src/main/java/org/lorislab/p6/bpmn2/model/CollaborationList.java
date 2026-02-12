package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationList {

    private final List<GlobalConversation> globalConversation = new ArrayList<>();

    private final List<Choreography> choreography = new ArrayList<>();

    public List<GlobalConversation> getGlobalConversation() {
        return globalConversation;
    }

    public List<Choreography> getChoreography() {
        return choreography;
    }
}
