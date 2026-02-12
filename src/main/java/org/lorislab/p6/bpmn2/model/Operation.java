package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Operation extends BaseElement<ExtensionElements> {

    private String name;

    private String implementationRef;

    private String inMessageRef;

    private String outMessageRef;

    private final List<String> errorRef = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImplementationRef() {
        return implementationRef;
    }

    public void setImplementationRef(String implementationRef) {
        this.implementationRef = implementationRef;
    }

    public String getInMessageRef() {
        return inMessageRef;
    }

    public void setInMessageRef(String inMessageRef) {
        this.inMessageRef = inMessageRef;
    }

    public String getOutMessageRef() {
        return outMessageRef;
    }

    public void setOutMessageRef(String outMessageRef) {
        this.outMessageRef = outMessageRef;
    }

    public List<String> getErrorRef() {
        return errorRef;
    }

}
