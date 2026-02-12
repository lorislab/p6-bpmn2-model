package org.lorislab.p6.bpmn2.model;

public class Performer extends ResourceRole {

    private final PerformerClass performerClass;

    public Performer() {
        this(PerformerClass.PERFORMER_CLASS);
    }

    public Performer(PerformerClass performerClass) {
        super(ResourceRoleClass.PERFORMER);
        this.performerClass = performerClass;
    }

    public PerformerClass getPerformerClass() {
        return performerClass;
    }

    public enum PerformerClass {
        PERFORMER_CLASS,
        HUMAN_PERFORMER,
        POTENTIAL_OWNER;
    }
}
