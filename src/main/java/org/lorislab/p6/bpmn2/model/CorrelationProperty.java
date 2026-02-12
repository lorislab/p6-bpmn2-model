package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CorrelationProperty extends RootElement<ExtensionElements> {

    private String name;

    private String type;

    private final List<CorrelationPropertyRetrievalExpression> correlationPropertyRetrievalExpression = new ArrayList<>();

    public CorrelationProperty() {
        super(RootElementClass.CORRELATION_PROPERTY);
    }

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

    public List<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression() {
        return correlationPropertyRetrievalExpression;
    }

}
