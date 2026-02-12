package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class ThrowEvent extends Event {

    private final List<DataInput> dataInput = new ArrayList<>();

    private final List<DataInputAssociation> dataInputAssociation = new ArrayList<>();

    private InputSet inputSet;

    private final List<String> eventDefinitionRef = new ArrayList<>();

    //EventDefinition
    private final EventDefinitionList eventDefinition = new EventDefinitionList();

    protected ThrowEvent(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public List<DataInput> getDataInput() {
        return dataInput;
    }

    public List<DataInputAssociation> getDataInputAssociation() {
        return dataInputAssociation;
    }

    public InputSet getInputSet() {
        return inputSet;
    }

    public void setInputSet(InputSet inputSet) {
        this.inputSet = inputSet;
    }

    public List<String> getEventDefinitionRef() {
        return eventDefinitionRef;
    }

    public EventDefinitionList getEventDefinition() {
        return eventDefinition;
    }

}
