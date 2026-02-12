package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Activity<T extends ExtensionElements> extends FlowNode<T> {

    private boolean isForCompensation;

    private int startQuantity;

    private int completionQuantity;

    private String _default;

    private InputOutputSpecification ioSpecification;

    private final List<Property> property = new ArrayList<>();

    private final List<DataInputAssociation> dataInputAssociation = new ArrayList<>();

    private final List<DataOutputAssociation> dataOutputAssociation = new ArrayList<>();

    private final List<ResourceRole> resourceRole = new ArrayList<>();

    private final List<LoopCharacteristics> loopCharacteristics = new ArrayList<>();

    protected Activity(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public boolean isForCompensation() {
        return isForCompensation;
    }

    public void setForCompensation(boolean forCompensation) {
        isForCompensation = forCompensation;
    }

    public int getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(int startQuantity) {
        this.startQuantity = startQuantity;
    }

    public int getCompletionQuantity() {
        return completionQuantity;
    }

    public void setCompletionQuantity(int completionQuantity) {
        this.completionQuantity = completionQuantity;
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public InputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    public void setIoSpecification(InputOutputSpecification ioSpecification) {
        this.ioSpecification = ioSpecification;
    }

    public List<Property> getProperty() {
        return property;
    }

    public List<DataInputAssociation> getDataInputAssociation() {
        return dataInputAssociation;
    }

    public List<DataOutputAssociation> getDataOutputAssociation() {
        return dataOutputAssociation;
    }

    public List<ResourceRole> getResourceRole() {
        return resourceRole;
    }

    public List<LoopCharacteristics> getLoopCharacteristics() {
        return loopCharacteristics;
    }

}
