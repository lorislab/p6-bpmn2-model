package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.InclusiveGateway;

public class InclusiveGatewayReader extends GatewayReader<InclusiveGateway> {

    public InclusiveGatewayReader() {
        super(InclusiveGateway::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, InclusiveGateway element) throws Exception {
        super.readAttrs(attrs, element);
        // default
        element.setDefault(attrs.getString(AttributeReader.ATTR_DEFAULT));
    }
}
