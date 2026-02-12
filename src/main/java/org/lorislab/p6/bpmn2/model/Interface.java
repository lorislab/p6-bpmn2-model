package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Interface extends RootElement<ExtensionElements> {

    private String name;

    private String implementationRef;

    private final List<Operation> operation = new ArrayList<>();

    public Interface() {
        super(RootElementClass.INTERFACE);
    }

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

    public List<Operation> getOperation() {
        return operation;
    }

}
