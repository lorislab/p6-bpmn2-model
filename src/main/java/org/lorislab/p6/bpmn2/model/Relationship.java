package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Relationship extends BaseElement<ExtensionElements> {

    private String type;

    private RelationshipDirection relationshipDirection;

    private final List<String> source = new ArrayList<>();

    private final List<String> target = new ArrayList<>();

    public enum RelationshipDirection {
        NONE,
        FORWARD,
        BACKWARD,
        BOTH;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RelationshipDirection getRelationshipDirection() {
        return relationshipDirection;
    }

    public void setRelationshipDirection(RelationshipDirection relationshipDirection) {
        this.relationshipDirection = relationshipDirection;
    }

    public List<String> getSource() {
        return source;
    }

    public List<String> getTarget() {
        return target;
    }
}
