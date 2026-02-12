package org.lorislab.p6.bpmn2.model;

public class CorrelationPropertyBinding extends BaseElement<ExtensionElements> {

    private String correlationPropertyRef;

    private FormalExpression dataPath;

    public String getCorrelationPropertyRef() {
        return correlationPropertyRef;
    }

    public void setCorrelationPropertyRef(String correlationPropertyRef) {
        this.correlationPropertyRef = correlationPropertyRef;
    }

    public FormalExpression getDataPath() {
        return dataPath;
    }

    public void setDataPath(FormalExpression dataPath) {
        this.dataPath = dataPath;
    }
}
