package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class UserTask extends Task<ExtensionElements> {

    private String implementation;

    private final List<Rendering> rendering = new ArrayList<>();

    public UserTask() {
        super(FlowElementClass.USER_TASK);
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public List<Rendering> getRendering() {
        return rendering;
    }
}
