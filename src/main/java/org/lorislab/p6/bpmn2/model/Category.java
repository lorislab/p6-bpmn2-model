package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Category extends RootElement<ExtensionElements> {

    private String name;

    private final List<CategoryValue> categoryValue = new ArrayList<>();

    public Category() {
        super(RootElementClass.CATEGORY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryValue> getCategoryValue() {
        return categoryValue;
    }

}
