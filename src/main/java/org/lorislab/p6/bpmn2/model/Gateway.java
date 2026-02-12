package org.lorislab.p6.bpmn2.model;

public abstract class Gateway extends FlowNode<ExtensionElements> {

    private GatewayDirection gatewayDirection;

    protected Gateway(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public enum GatewayDirection {
        Unspecified,
        Converging,
        Diverging,
        Mixed;
    }

    public GatewayDirection getGatewayDirection() {
        return gatewayDirection;
    }

    public void setGatewayDirection(GatewayDirection gatewayDirection) {
        this.gatewayDirection = gatewayDirection;
    }
}
