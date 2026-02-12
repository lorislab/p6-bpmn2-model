package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_DEFINITION;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_MUST_UNDERSTAND;
import static org.lorislab.p6.bpmn2.reader.Readers.DOCUMENTATION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Extension;

public class ExtensionReader extends Reader<Extension> {

    public ExtensionReader() {
        super(Extension::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Extension element) throws Exception {
        super.readAttrs(attrs, element);
        // definition
        element.setDefinition(attrs.getString(ATTR_DEFINITION));
        // mustUnderstand
        element.setMustUnderstand(attrs.getBoolean(ATTR_MUST_UNDERSTAND, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Extension element) throws Exception {
        super.readElement(reader, name, element);
        // documentation
        readElementSequence(DOCUMENTATION_READER, reader, "documentation", element.getDocumentation());
    }

}
