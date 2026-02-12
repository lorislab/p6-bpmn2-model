package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ResourceParameterBinding;

public class ResourceParameterBindingReader extends BaseElementReader<ResourceParameterBinding> {

    private static final QName ATTR_PARAMETER_REF = new QName("parameterRef");

    public ResourceParameterBindingReader() {
        super(ResourceParameterBinding::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ResourceParameterBinding element) throws Exception {
        super.readAttrs(attrs, element);
        // parameterRef
        element.setParameterRef(attrs.getString(ATTR_PARAMETER_REF, true));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ResourceParameterBinding element) throws Exception {
        super.readElement(reader, name, element);
        // expression
        var localName = reader.getLocalName();
        switch (localName) {
            case "expression" -> readElementSequenceItem(EXPRESSION_READER, reader, localName, element::setExpression, true);
            case "formalExpression" ->
                readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, localName, element::setExpression, true);
        }
    }

}
