package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CorrelationKey extends BaseElement<ExtensionElements> {

    private String name;

    private final List<String> correlationPropertyRef = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCorrelationPropertyRef() {
        return correlationPropertyRef;
    }

    public void addCorrelationPropertyRef(String item) {
        correlationPropertyRef.add(item);
    }

}
