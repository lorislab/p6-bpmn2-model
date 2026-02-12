package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class OutputSet extends BaseElement<ExtensionElements> {

    private String name;

    private final List<String> dataOutputRefs = new ArrayList<>();

    private final List<String> optionalOutputRefs = new ArrayList<>();

    private final List<String> whileExecutingOutputRefs = new ArrayList<>();

    private final List<String> inputSetRefs = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDataOutputRefs() {
        return dataOutputRefs;
    }

    public List<String> getOptionalOutputRefs() {
        return optionalOutputRefs;
    }

    public List<String> getWhileExecutingOutputRefs() {
        return whileExecutingOutputRefs;
    }

    public List<String> getInputSetRefs() {
        return inputSetRefs;
    }

}
