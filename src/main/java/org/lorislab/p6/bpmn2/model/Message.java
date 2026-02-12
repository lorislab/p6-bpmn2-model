package org.lorislab.p6.bpmn2.model;

public class Message extends RootElement<ExtensionElements> {

    private String name;

    private String itemRef;

    public Message() {
        super(RootElementClass.MESSAGE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemRef() {
        return itemRef;
    }

    public void setItemRef(String itemRef) {
        this.itemRef = itemRef;
    }
}
