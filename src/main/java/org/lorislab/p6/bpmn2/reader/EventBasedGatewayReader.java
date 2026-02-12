package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.EventBasedGateway;

public class EventBasedGatewayReader extends GatewayReader<EventBasedGateway> {
    public EventBasedGatewayReader() {
        super(EventBasedGateway::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, EventBasedGateway element) throws Exception {
        super.readAttrs(attrs, element);
        // instantiate
        element.setInstantiate(attrs.getBoolean(AttributeReader.ATTR_INSTANTIATE, false));
        // eventGatewayType
        element.setEventGatewayType(attrs.getEnum(AttributeReader.ATTR_EVENT_GATEWAY_TYPE,
                EventBasedGateway.EventBasedGatewayType.class, EventBasedGateway.EventBasedGatewayType.Exclusive));
    }
}
