package org.lorislab.p6.bpmn2.model;

public class DataOutput extends BaseElement<ExtensionElements> {

    private String name;

    private String itemSubjectRef;

    private boolean isCollection;

    private DataState dataState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemSubjectRef() {
        return itemSubjectRef;
    }

    public void setItemSubjectRef(String itemSubjectRef) {
        this.itemSubjectRef = itemSubjectRef;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }

    public DataState getDataState() {
        return dataState;
    }
}
