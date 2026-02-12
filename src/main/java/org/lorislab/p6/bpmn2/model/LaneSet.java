package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class LaneSet extends BaseElement<ExtensionElements> {

    private String name;

    private final List<Lane> lanes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lane> getLanes() {
        return lanes;
    }

}
