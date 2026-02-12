package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CallableElement<T extends ExtensionElements> extends RootElement<T> {

    private String name;

    private final List<String> supportedInterfaceRefs = new ArrayList<>();

    private InputOutputSpecification ioSpecification;

    private final List<InputOutputBinding> inputOutputBindings = new ArrayList<>();

    public CallableElement() {
        super(RootElementClass.CALLABLE_ELEMENT);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSupportedInterfaceRefs() {
        return supportedInterfaceRefs;
    }

    public InputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    public void setIoSpecification(InputOutputSpecification ioSpecification) {
        this.ioSpecification = ioSpecification;
    }

    public List<InputOutputBinding> getInputOutputBindings() {
        return inputOutputBindings;
    }

}
