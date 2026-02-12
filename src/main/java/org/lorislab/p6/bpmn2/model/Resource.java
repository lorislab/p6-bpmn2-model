package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Resource extends RootElement<ExtensionElements> {

    private String name;

    private final List<ResourceParameter> resourceParameter = new ArrayList<>();

    public Resource() {
        super(RootElementClass.RESOURCE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ResourceParameter> getResourceParameter() {
        return resourceParameter;
    }

}
