package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.CORRELATION_PROPERTY_BINDING_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CorrelationSubscription;

public class CorrelationSubscriptionReader extends BaseElementReader<CorrelationSubscription> {

    private static final QName ATTR_CORRELATION_KEY_REF = new QName("correlationKeyRef");

    public CorrelationSubscriptionReader() {
        super(CorrelationSubscription::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CorrelationSubscription element) throws Exception {
        super.readAttrs(attrs, element);
        // correlationKeyRef
        element.setCorrelationKeyRef(attrs.getString(ATTR_CORRELATION_KEY_REF, true));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CorrelationSubscription element) throws Exception {
        super.readElement(reader, name, element);
        // correlationPropertyBinding
        readElementSequence(CORRELATION_PROPERTY_BINDING_READER, reader, "correlationPropertyBinding",
                element.getCorrelationPropertyBinding());
    }

}
