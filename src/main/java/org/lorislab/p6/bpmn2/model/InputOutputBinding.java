package org.lorislab.p6.bpmn2.model;

public class InputOutputBinding extends BaseElement<ExtensionElements> {

    private String operationRef;

    private String inputDataRef;

    private String outputDataRef;

    public String getOperationRef() {
        return operationRef;
    }

    public void setOperationRef(String operationRef) {
        this.operationRef = operationRef;
    }

    public String getInputDataRef() {
        return inputDataRef;
    }

    public void setInputDataRef(String inputDataRef) {
        this.inputDataRef = inputDataRef;
    }

    public String getOutputDataRef() {
        return outputDataRef;
    }

    public void setOutputDataRef(String outputDataRef) {
        this.outputDataRef = outputDataRef;
    }
}
