package org.lorislab.p6.bpmn2.model;

public class DataObject extends FlowElement<ExtensionElements> {

    private String itemSubjectRef;

    private boolean isCollection;

    private DataState dataState;

    public DataObject() {
        super(FlowElementClass.DATA_OBJECT);
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

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}
