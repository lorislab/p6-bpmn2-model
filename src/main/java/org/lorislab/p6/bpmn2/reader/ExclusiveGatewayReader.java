package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.ExclusiveGateway;

public class ExclusiveGatewayReader extends GatewayReader<ExclusiveGateway> {

    public ExclusiveGatewayReader() {
        super(ExclusiveGateway::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ExclusiveGateway element) throws Exception {
        super.readAttrs(attrs, element);
        // default
        element.setDefault(attrs.getString(AttributeReader.ATTR_DEFAULT));
    }
}
