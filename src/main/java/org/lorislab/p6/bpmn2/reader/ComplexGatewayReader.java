package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ComplexGateway;

public class ComplexGatewayReader extends GatewayReader<ComplexGateway> {
    public ComplexGatewayReader() {
        super(ComplexGateway::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ComplexGateway element) throws Exception {
        super.readAttrs(attrs, element);
        // default
        element.setDefault(attrs.getString(AttributeReader.ATTR_DEFAULT));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ComplexGateway element) throws Exception {
        super.readElement(reader, name, element);
        // activationCondition
        readElementSequenceItem(EXPRESSION_READER, reader, "activationCondition", element::setActivationCondition);
    }
}
