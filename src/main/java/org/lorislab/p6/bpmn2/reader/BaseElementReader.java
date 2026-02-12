package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ID;
import static org.lorislab.p6.bpmn2.reader.Readers.DOCUMENTATION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.EXTENSION_ELEMENTS_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.BaseElement;
import org.lorislab.p6.bpmn2.model.ExtensionElements;

public class BaseElementReader<T extends BaseElement<? extends ExtensionElements>> extends Reader<T> {

    protected static final String ELEMENT_EXTENSIONS_ELEMENTS = "extensionElements";

    public BaseElementReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        // id
        element.setId(attrs.getString(ATTR_ID));
        // other attributes
        attrs.readOther(element.getOtherAttributes());
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // documentation
        readElementSequence(DOCUMENTATION_READER, reader, "documentation", element.getDocumentations());
        // extensionElements
        readExtensionElements(reader, element);
    }

    protected void readExtensionElements(XMLStreamReader2 reader, T element) throws Exception {
        readElementSequenceItem(EXTENSION_ELEMENTS_READER, reader, ELEMENT_EXTENSIONS_ELEMENTS, (x) -> {
        });
    }
}
