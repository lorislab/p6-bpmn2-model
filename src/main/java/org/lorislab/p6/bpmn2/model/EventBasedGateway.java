package org.lorislab.p6.bpmn2.model;

public class EventBasedGateway extends Gateway {

    private boolean instantiate;

    private EventBasedGatewayType eventGatewayType;

    public EventBasedGateway() {
        super(FlowElementClass.EVENT_BASED_GATEWAY);
    }

    public enum EventBasedGatewayType {
        Exclusive,
        Parallel;
    }

    public boolean isInstantiate() {
        return instantiate;
    }

    public void setInstantiate(boolean instantiate) {
        this.instantiate = instantiate;
    }

    public EventBasedGatewayType getEventGatewayType() {
        return eventGatewayType;
    }

    public void setEventGatewayType(EventBasedGatewayType eventGatewayType) {
        this.eventGatewayType = eventGatewayType;
    }
}
