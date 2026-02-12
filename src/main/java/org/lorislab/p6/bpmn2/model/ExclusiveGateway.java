package org.lorislab.p6.bpmn2.model;

import static org.lorislab.p6.bpmn2.model.FlowElement.FlowElementClass.EXCLUSIVE_GATEWAY;

public class ExclusiveGateway extends Gateway {

    private String _default;

    public ExclusiveGateway() {
        super(EXCLUSIVE_GATEWAY);
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }
}
