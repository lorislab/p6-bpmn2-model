package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Extension {

    private String definition;

    private boolean mustUnderstand;

    private final List<Documentation> documentation = new ArrayList<>();

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public boolean isMustUnderstand() {
        return mustUnderstand;
    }

    public void setMustUnderstand(boolean mustUnderstand) {
        this.mustUnderstand = mustUnderstand;
    }

    public List<Documentation> getDocumentation() {
        return documentation;
    }
}
