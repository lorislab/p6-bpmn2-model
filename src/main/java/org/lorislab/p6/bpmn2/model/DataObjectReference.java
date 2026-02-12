package org.lorislab.p6.bpmn2.model;

public class DataObjectReference extends FlowElement<ExtensionElements> {

    private String itemSubjectRef;

    private String dataObjectRef;

    private DataState dataState;

    public DataObjectReference() {
        super(FlowElementClass.DATA_OBJECT_REFERENCE);
    }

    public String getItemSubjectRef() {
        return itemSubjectRef;
    }

    public void setItemSubjectRef(String itemSubjectRef) {
        this.itemSubjectRef = itemSubjectRef;
    }

    public String getDataObjectRef() {
        return dataObjectRef;
    }

    public void setDataObjectRef(String dataObjectRef) {
        this.dataObjectRef = dataObjectRef;
    }

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}
