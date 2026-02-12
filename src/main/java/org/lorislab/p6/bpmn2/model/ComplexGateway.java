package org.lorislab.p6.bpmn2.model;

public class ComplexGateway extends Gateway {

    private String _default;

    private Expression activationCondition;

    public ComplexGateway() {
        super(FlowElementClass.COMPLEX_GATEWAY);
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public Expression getActivationCondition() {
        return activationCondition;
    }

    public void setActivationCondition(Expression activationCondition) {
        this.activationCondition = activationCondition;
    }
}
