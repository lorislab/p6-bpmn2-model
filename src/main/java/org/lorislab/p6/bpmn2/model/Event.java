package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Event extends FlowNode<ExtensionElements> {

    private final List<Property> property = new ArrayList<>();

    public Event() {
        super(FlowElementClass.EVENT);
    }

    protected Event(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public List<Property> getProperty() {
        return property;
    }

}
