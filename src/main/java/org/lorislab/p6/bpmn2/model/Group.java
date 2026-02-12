package org.lorislab.p6.bpmn2.model;

public class Group extends Artifact {

    private String categoryValueRef;

    public Group() {
        super(ArtifactClass.GROUP);
    }

    public String getCategoryValueRef() {
        return categoryValueRef;
    }

    public void setCategoryValueRef(String categoryValueRef) {
        this.categoryValueRef = categoryValueRef;
    }
}
