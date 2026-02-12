package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class LinkEventDefinition extends EventDefinition {

    private final List<String> source = new ArrayList<>();

    private String target;

    private String name;

    public LinkEventDefinition() {
        super(EventDefinitionClass.LINK_EVENT_DEFINITION);
    }

    public List<String> getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
