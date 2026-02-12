package org.lorislab.p6.bpmn2.model;

public class InclusiveGateway extends Gateway {

    private String _default;

    public InclusiveGateway() {
        super(FlowElementClass.INCLUSIVE_GATEWAY);
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }
}
