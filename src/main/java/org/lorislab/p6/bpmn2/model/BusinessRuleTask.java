package org.lorislab.p6.bpmn2.model;

public class BusinessRuleTask extends Task<ExtensionElements> {

    private String implementation;

    public BusinessRuleTask() {
        super(FlowElementClass.BUSINESS_RULE_TASK);
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
}
