package org.lorislab.p6.bpmn2.model;

public class ResourceParameter extends BaseElement<ExtensionElements> {

    private String name;

    private String type;

    private boolean isRequired;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
