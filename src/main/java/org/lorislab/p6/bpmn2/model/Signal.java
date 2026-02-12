package org.lorislab.p6.bpmn2.model;

public class Signal extends RootElement<ExtensionElements> {

    private String name;

    private String structureRef;

    public Signal() {
        super(RootElementClass.SIGNAL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStructureRef() {
        return structureRef;
    }

    public void setStructureRef(String structureRef) {
        this.structureRef = structureRef;
    }
}
