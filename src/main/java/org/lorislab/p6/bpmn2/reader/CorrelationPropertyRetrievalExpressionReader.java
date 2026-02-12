package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_MESSAGE_REF;
import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CorrelationPropertyRetrievalExpression;

public class CorrelationPropertyRetrievalExpressionReader extends BaseElementReader<CorrelationPropertyRetrievalExpression> {

    public CorrelationPropertyRetrievalExpressionReader() {
        super(CorrelationPropertyRetrievalExpression::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CorrelationPropertyRetrievalExpression element) throws Exception {
        super.readAttrs(attrs, element);
        // messageRef
        element.setMessageRef(attrs.getString(ATTR_MESSAGE_REF, true));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CorrelationPropertyRetrievalExpression element)
            throws Exception {
        super.readElement(reader, name, element);
        // messagePath
        readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, "messagePath", element::setMessagePath, true);
    }

}
