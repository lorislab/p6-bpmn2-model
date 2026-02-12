package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Lane extends BaseElement<ExtensionElements> {

    private String name;

    private String partitionElementRef;

    private PartitionElement partitionElement;

    private final List<String> flowNodeRef = new ArrayList<>();

    private LaneSet childLaneSet;

    public LaneSet getChildLaneSet() {
        return childLaneSet;
    }

    public void setChildLaneSet(LaneSet childLaneSet) {
        this.childLaneSet = childLaneSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartitionElementRef() {
        return partitionElementRef;
    }

    public void setPartitionElementRef(String partitionElementRef) {
        this.partitionElementRef = partitionElementRef;
    }

    public PartitionElement getPartitionElement() {
        return partitionElement;
    }

    public void setPartitionElement(PartitionElement partitionElement) {
        this.partitionElement = partitionElement;
    }

    public List<String> getFlowNodeRef() {
        return flowNodeRef;
    }

}
