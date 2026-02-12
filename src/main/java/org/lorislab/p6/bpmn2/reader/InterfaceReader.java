package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.OPERATION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Interface;

public class InterfaceReader extends RootElementReader<Interface> {

    public InterfaceReader() {
        super(Interface::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Interface element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME, true));
        // implementationRef
        element.setName(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Interface element) throws Exception {
        super.readElement(reader, name, element);
        // operation
        readElementSequence(OPERATION_READER, reader, "operation", element.getOperation());
    }
}
