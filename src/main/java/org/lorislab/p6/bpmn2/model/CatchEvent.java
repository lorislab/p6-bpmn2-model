package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CatchEvent extends Event {

    private boolean parallelMultiple;

    private final List<DataOutput> dataOutput = new ArrayList<>();

    private final List<DataOutputAssociation> dataOutputAssociation = new ArrayList<>();

    private OutputSet outputSet;

    private final EventDefinitionList eventDefinition = new EventDefinitionList();

    private final List<String> eventDefinitionRef = new ArrayList<>();

    protected CatchEvent(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public boolean isParallelMultiple() {
        return parallelMultiple;
    }

    public void setParallelMultiple(boolean parallelMultiple) {
        this.parallelMultiple = parallelMultiple;
    }

    public List<DataOutput> getDataOutput() {
        return dataOutput;
    }

    public List<DataOutputAssociation> getDataOutputAssociation() {
        return dataOutputAssociation;
    }

    public OutputSet getOutputSet() {
        return outputSet;
    }

    public void setOutputSet(OutputSet outputSet) {
        this.outputSet = outputSet;
    }

    public EventDefinitionList getEventDefinition() {
        return eventDefinition;
    }

    public List<String> getEventDefinitionRef() {
        return eventDefinitionRef;
    }

}
