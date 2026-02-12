package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_GATEWAY_DIRECTION;

import java.util.function.Supplier;

import org.lorislab.p6.bpmn2.model.Gateway;

public class GatewayReader<T extends Gateway> extends FlowNodeReader<T> {

    public GatewayReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // gatewayDirection
        element.setGatewayDirection(
                attrs.getEnum(ATTR_GATEWAY_DIRECTION, Gateway.GatewayDirection.class, Gateway.GatewayDirection.Unspecified));
    }
}
