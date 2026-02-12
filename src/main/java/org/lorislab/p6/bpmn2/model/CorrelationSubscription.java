package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class CorrelationSubscription extends BaseElement<ExtensionElements> {

    private final List<CorrelationPropertyBinding> correlationPropertyBinding = new ArrayList<>();

    private String correlationKeyRef;

    public List<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
        return correlationPropertyBinding;
    }

    public String getCorrelationKeyRef() {
        return correlationKeyRef;
    }

    public void setCorrelationKeyRef(String correlationKeyRef) {
        this.correlationKeyRef = correlationKeyRef;
    }
}
