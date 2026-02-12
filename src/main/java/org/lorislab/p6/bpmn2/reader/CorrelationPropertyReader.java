package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CorrelationProperty;

public class CorrelationPropertyReader extends RootElementReader<CorrelationProperty> {

    public CorrelationPropertyReader() {
        super(CorrelationProperty::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CorrelationProperty element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // type
        element.setType(attrs.getString(AttributeReader.ATTR_TYPE));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CorrelationProperty element) throws Exception {
        super.readElement(reader, name, element);
        // correlationPropertyRetrievalExpression
        readElementSequence(CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_READER, reader, "correlationPropertyRetrievalExpression",
                element.getCorrelationPropertyRetrievalExpression(), 1);
    }
}
