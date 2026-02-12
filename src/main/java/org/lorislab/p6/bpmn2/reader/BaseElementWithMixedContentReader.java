package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.DOCUMENTATION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.EXTENSION_ELEMENTS_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.BaseElementWithMixedContent;

public abstract class BaseElementWithMixedContentReader<T extends BaseElementWithMixedContent> extends Reader<T> {

    public BaseElementWithMixedContentReader(Supplier<T> supplier) {
        super(supplier, true);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        // id
        element.setId(attrs.getString(AttributeReader.ATTR_ID));
        // other attributes
        attrs.readOther(element.getOtherAttributes());
    }

    @Override
    protected void readMixedContent(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readMixedContent(reader, name, element);
        readMixedContentValue(reader, name, element, element::setContent);
    }

    protected void readMixedContentElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        var childName = reader.getLocalName();
        switch (childName) {
            case "documentation" ->
                DOCUMENTATION_READER.read(reader, name, element.getDocumentation()::add);
            case "extensionElements" -> {
                if (element.getExtensionElements() != null) {
                    throw new IllegalStateException("Element " + name + " already set in the mixed content.");
                }
                EXTENSION_ELEMENTS_READER.read(reader, name, element::setExtensionElements);
            }
            default ->
                throw new IllegalStateException("Illegal element in the mixed content. Element '" + name + "'");
        }
    }

}
