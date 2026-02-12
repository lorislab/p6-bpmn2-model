package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CorrelationKey;

public class CorrelationKeyReader extends BaseElementReader<CorrelationKey> {

    public CorrelationKeyReader() {
        super(CorrelationKey::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CorrelationKey element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CorrelationKey element) throws Exception {
        super.readElement(reader, name, element);
        // correlationPropertyRef
        readTextElementList(reader, "correlationPropertyRef", element.getCorrelationPropertyRef());
    }

}
