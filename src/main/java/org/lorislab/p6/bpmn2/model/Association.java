package org.lorislab.p6.bpmn2.model;

public class Association extends Artifact {

    private String sourceRef;

    private String targetRef;

    private AssociationDirection associationDirection;

    public Association() {
        super(ArtifactClass.ASSOCIATION);
    }

    public enum AssociationDirection {
        None,
        One,
        Both;
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public AssociationDirection getAssociationDirection() {
        return associationDirection;
    }

    public void setAssociationDirection(AssociationDirection associationDirection) {
        this.associationDirection = associationDirection;
    }
}
