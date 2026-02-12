package org.lorislab.p6.bpmn2.model;

public class DataStoreReference extends FlowElement<ExtensionElements> {

    private DataState dataState;

    private String itemSubjectRef;

    private String dataStoreRef;

    public DataStoreReference() {
        super(FlowElementClass.DATA_STORE_REFERENCE);
    }

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }

    public String getItemSubjectRef() {
        return itemSubjectRef;
    }

    public void setItemSubjectRef(String itemSubjectRef) {
        this.itemSubjectRef = itemSubjectRef;
    }

    public String getDataStoreRef() {
        return dataStoreRef;
    }

    public void setDataStoreRef(String dataStoreRef) {
        this.dataStoreRef = dataStoreRef;
    }
}
