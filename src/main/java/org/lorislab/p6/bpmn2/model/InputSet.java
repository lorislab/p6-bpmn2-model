package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class InputSet extends BaseElement<ExtensionElements> {

    private String name;

    private final List<String> dataInputRefs = new ArrayList<>();

    private final List<String> optionalInputRefs = new ArrayList<>();

    private final List<String> whileExecutingInputRefs = new ArrayList<>();

    private final List<String> outputSetRefs = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDataInputRefs() {
        return dataInputRefs;
    }

    public List<String> getOptionalInputRefs() {
        return optionalInputRefs;
    }

    public List<String> getWhileExecutingInputRefs() {
        return whileExecutingInputRefs;
    }

    public List<String> getOutputSetRefs() {
        return outputSetRefs;
    }

}
