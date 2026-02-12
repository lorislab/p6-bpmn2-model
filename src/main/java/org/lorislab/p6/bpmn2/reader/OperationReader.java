package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Operation;

public class OperationReader extends BaseElementReader<Operation> {

    public OperationReader() {
        super(Operation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Operation element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME, true));
        // implementationRef
        element.setImplementationRef(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Operation element) throws Exception {
        super.readElement(reader, name, element);
        // inMessageRef
        readTextElement(reader, "inMessageRef", element::setImplementationRef, true);
        // outMessageRef
        readTextElement(reader, "outMessageRef", element::setOutMessageRef);
        // errorRef
        readTextElementList(reader, "errorRef", element.getErrorRef());
    }
}
