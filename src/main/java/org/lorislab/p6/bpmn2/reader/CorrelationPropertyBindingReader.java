package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CorrelationPropertyBinding;

public class CorrelationPropertyBindingReader extends BaseElementReader<CorrelationPropertyBinding> {

    private static final QName ATTR_CORRELATION_PROPERTY_BINDING = new QName("correlationPropertyRef");

    public CorrelationPropertyBindingReader() {
        super(CorrelationPropertyBinding::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CorrelationPropertyBinding element) throws Exception {
        super.readAttrs(attrs, element);
        // correlationPropertyRef
        element.setCorrelationPropertyRef(attrs.getString(ATTR_CORRELATION_PROPERTY_BINDING, true));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CorrelationPropertyBinding element) throws Exception {
        super.readElement(reader, name, element);
        // dataPath
        readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, "dataPath", element::setDataPath, true);
    }
}
