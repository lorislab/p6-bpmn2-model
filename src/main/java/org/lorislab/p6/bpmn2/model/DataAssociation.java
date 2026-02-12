package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class DataAssociation extends BaseElement<ExtensionElements> {

    private final List<String> sourceRef = new ArrayList<>();

    private String targetRef;

    private FormalExpression transformation;

    private final List<Assignment> assignment = new ArrayList<>();

    public List<String> getSourceRef() {
        return sourceRef;
    }

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public FormalExpression getTransformation() {
        return transformation;
    }

    public void setTransformation(FormalExpression transformation) {
        this.transformation = transformation;
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

}
