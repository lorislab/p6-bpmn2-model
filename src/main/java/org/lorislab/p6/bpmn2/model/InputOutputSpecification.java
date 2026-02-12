package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class InputOutputSpecification extends BaseElement<ExtensionElements> {

    private final List<DataInput> dataInputs = new ArrayList<>();

    private final List<DataOutput> dataOutputs = new ArrayList<>();

    private final List<InputSet> inputSets = new ArrayList<>();

    private final List<OutputSet> outputSets = new ArrayList<>();

    public List<DataInput> getDataInputs() {
        return dataInputs;
    }

    public List<DataOutput> getDataOutputs() {
        return dataOutputs;
    }

    public List<InputSet> getInputSets() {
        return inputSets;
    }

    public List<OutputSet> getOutputSets() {
        return outputSets;
    }

}
