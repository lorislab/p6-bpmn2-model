package org.lorislab.p6.bpmn2.model;

public abstract class Artifact extends BaseElement<ExtensionElements> {

    private final ArtifactClass artifactClass;

    protected Artifact(ArtifactClass artifactClass) {
        this.artifactClass = artifactClass;
    }

    public ArtifactClass getArtifactClass() {
        return artifactClass;
    }

    public enum ArtifactClass {
        TEXT_ANNOTATION,
        GROUP,
        ASSOCIATION;
    }
}
