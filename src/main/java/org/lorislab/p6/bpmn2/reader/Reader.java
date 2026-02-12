package org.lorislab.p6.bpmn2.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;

import org.codehaus.stax2.XMLStreamReader2;

public abstract class Reader<T> {

    public static final String URL = "http://www.omg.org/spec/BPMN/20100524/MODEL";

    private final Supplier<T> supplier;

    private final boolean mixed;

    public Reader(Supplier<T> supplier) {
        this(supplier, false);
    }

    public Reader(Supplier<T> supplier, boolean mixed) {
        this.supplier = supplier;
        this.mixed = mixed;
    }

    protected void readMixedContent(XMLStreamReader2 reader, String name, T element) throws Exception {
    }

    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
    }

    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
    }

    protected T createElement(XMLStreamReader2 reader, AttributeReader attrs) {
        return supplier.get();
    }

    public boolean read(XMLStreamReader2 reader, String name, Consumer<T> fn) throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }

        var attrs = new AttributeReader(reader);
        T element = createElement(reader, attrs);

        // read all element attributes
        readAttrs(attrs, element);

        if (mixed) {
            // read mixed content
            readMixedContent(reader, name, element);

        } else {
            // move to next element/child
            reader.nextTag();

            // read element content
            readElement(reader, name, element);
        }

        // set result to consumer
        fn.accept(element);

        // validate if we are on the end element
        validateEndElement(reader, name);
        return true;
    }

    public boolean findElement(XMLStreamReader2 reader, String name) throws Exception {
        while (reader.hasNext()) {
            reader.nextTag();
            if (reader.isStartElement()) {
                if (name.equals(reader.getLocalName())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean isEndElement(XMLStreamReader2 reader, String name) {
        return reader.isEndElement() && name.equals(reader.getLocalName());
    }

    protected boolean isStartElement(XMLStreamReader2 reader, String localName) {
        return reader.isStartElement() && localName.equals(reader.getLocalName());
    }

    protected void readTextElementList(XMLStreamReader2 reader, String name, List<String> fn) throws Exception {
        readTextElementList(reader, name, fn, 0);
    }

    protected void readTextElementList(XMLStreamReader2 reader, String name, List<String> fn, int minOccurs) throws Exception {
        readTextElementList(reader, name, fn, minOccurs, Integer.MAX_VALUE);
    }

    protected void readTextElementList(XMLStreamReader2 reader, String name, List<String> fn, int minOccurs, int maxOccurs)
            throws Exception {
        while (isStartElement(reader, name)) {
            fn.add(reader.getElementText());
            reader.nextTag();
        }
        if (minOccurs <= fn.size() && fn.size() <= maxOccurs) {
            return;
        }
        throw new IllegalStateException("Element sequence '" + name + "' is not valid. [minOccurs:" + minOccurs + ",maxOccurs:"
                + maxOccurs + "] current size:" + fn.size());
    }

    protected void readTextElement(XMLStreamReader2 reader, String name, Consumer<String> fn) throws Exception {
        readTextElement(reader, name, fn, false);
    }

    protected void readTextElement(XMLStreamReader2 reader, String name, Consumer<String> fn, boolean required)
            throws Exception {
        var list = new ArrayList<String>();
        readTextElementList(reader, name, list, required ? 1 : 0, 1);
        if (!list.isEmpty()) {
            fn.accept(list.getFirst());
            return;
        }
        if (required) {
            throw new IllegalStateException("Element text '" + name + "' is required.");
        }
    }

    protected void readAllOtherChildElements(XMLStreamReader2 reader, String name, Map<QName, String> fn) throws Exception {
        if (isEndElement(reader, name)) {
            return;
        }
        while (!isEndElement(reader, name)) {
            var child = reader.getName();
            if (URL.equals(child.getNamespaceURI())) {
                throw new IllegalStateException("Element is not allow in ##other. Element: " + child);
            }
            fn.put(child, Writer.getRawXmlFromCurrentElement(reader));
            reader.nextTag();
        }
    }

    protected <K> void readElementSequence(Reader<K> r, XMLStreamReader2 reader, String name, List<K> fn) throws Exception {
        readElementSequence(r, reader, name, fn, 0);
    }

    protected <K> void readElementSequence(Reader<K> r, XMLStreamReader2 reader, String name, List<K> fn, int minOccurs)
            throws Exception {
        readElementSequence(r, reader, name, fn, minOccurs, Integer.MAX_VALUE);
    }

    protected <K> void readElementSequence(Reader<K> r, XMLStreamReader2 reader, String name, List<K> fn, int minOccurs,
            int maxOccurs) throws Exception {
        while (r.read(reader, name, fn::add)) {
            reader.nextTag();
        }
        if (minOccurs <= fn.size() && fn.size() <= maxOccurs) {
            return;
        }
        throw new IllegalStateException("Element sequence '" + name + "' is not valid. [minOccurs:" + minOccurs + ",maxOccurs:"
                + maxOccurs + "] current size:" + fn.size());
    }

    protected <K> void readElementSequenceItem(Reader<K> r, XMLStreamReader2 reader, String name, Consumer<K> fn)
            throws Exception {
        readElementSequenceItem(r, reader, name, fn, false);
    }

    protected <K> void readElementSequenceItem(Reader<K> r, XMLStreamReader2 reader, String name, Consumer<K> fn,
            boolean required) throws Exception {
        var list = new ArrayList<K>();
        readElementSequence(r, reader, name, list, required ? 1 : 0, 1);
        if (!list.isEmpty()) {
            fn.accept(list.getFirst());
            return;
        }
        if (required) {
            throw new IllegalStateException("Element '" + name + "' is required.");
        }
    }

    protected void validateEndElement(XMLStreamReader2 reader, String name) {
        if (!isEndElement(reader, name)) {
            throw new RuntimeException("Error: Not valid element. Expected element " + name + "/" + ElementType.END_ELEMENT
                    + " found element: " + reader.getLocalName() + "/" + getElementType(reader));
        }
    }

    public ElementType getElementType(XMLStreamReader2 reader) {
        return ElementType.valueOf(reader.getEventType());
    }

    protected void readMixedContentValue(XMLStreamReader2 reader, String name, T element, Consumer<String> fn)
            throws Exception {
        var content = new StringBuilder();
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.CDATA:
                case XMLStreamConstants.CHARACTERS:
                    content.append(reader.getText().trim());
                    break;
                case XMLStreamConstants.START_ELEMENT:
                    readMixedContentElement(reader, name, element);
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    validateEndElement(reader, name);
                    fn.accept(content.toString());
                    return;
            }
        }
        fn.accept(content.toString());
    }

    protected void readMixedContentElement(XMLStreamReader2 reader, String name, T element) throws Exception {
    }

    protected void skipToEndElement(XMLStreamReader2 reader, String name) throws Exception {
        var depth = 0;

        while (reader.hasNext()) {
            var type = reader.next();
            if (XMLStreamConstants.START_ELEMENT == type) {
                if (name.equals(reader.getLocalName())) {
                    depth++;
                }
            }
            if (XMLStreamConstants.END_ELEMENT == type) {
                if (name.equals(reader.getLocalName())) {
                    depth--;
                    if (depth < 0) {
                        break;
                    }
                }
            }
        }
    }

    public enum ElementType {

        START_ELEMENT(XMLStreamConstants.START_ELEMENT),
        END_ELEMENT(XMLStreamConstants.END_ELEMENT),
        PROCESSING_INSTRUCTION(XMLStreamConstants.PROCESSING_INSTRUCTION),
        CHARACTERS(XMLStreamConstants.CHARACTERS),
        COMMENT(XMLStreamConstants.COMMENT),
        SPACE(XMLStreamConstants.SPACE),
        START_DOCUMENT(XMLStreamConstants.START_DOCUMENT),
        END_DOCUMENT(XMLStreamConstants.END_DOCUMENT),
        ENTITY_REFERENCE(XMLStreamConstants.ENTITY_REFERENCE),
        ATTRIBUTE(XMLStreamConstants.ATTRIBUTE),
        DTD(XMLStreamConstants.DTD),
        CDATA(XMLStreamConstants.CDATA),
        NAMESPACE(XMLStreamConstants.NAMESPACE),
        NOTATION_DECLARATION(XMLStreamConstants.NOTATION_DECLARATION),
        ENTITY_DECLARATION(XMLStreamConstants.ENTITY_DECLARATION);

        private final int value;

        ElementType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static ElementType valueOf(int value) {
            return switch (value) {
                case XMLStreamConstants.START_ELEMENT -> START_ELEMENT;
                case XMLStreamConstants.END_ELEMENT -> END_ELEMENT;
                case XMLStreamConstants.PROCESSING_INSTRUCTION -> PROCESSING_INSTRUCTION;
                case XMLStreamConstants.CHARACTERS -> CHARACTERS;
                case XMLStreamConstants.COMMENT -> COMMENT;
                case XMLStreamConstants.SPACE -> SPACE;
                case XMLStreamConstants.START_DOCUMENT -> START_DOCUMENT;
                case XMLStreamConstants.END_DOCUMENT -> END_DOCUMENT;
                case XMLStreamConstants.ENTITY_REFERENCE -> ENTITY_REFERENCE;
                case XMLStreamConstants.ATTRIBUTE -> ATTRIBUTE;
                case XMLStreamConstants.DTD -> DTD;
                case XMLStreamConstants.CDATA -> CDATA;
                case XMLStreamConstants.NAMESPACE -> NAMESPACE;
                case XMLStreamConstants.NOTATION_DECLARATION -> NOTATION_DECLARATION;
                case XMLStreamConstants.ENTITY_DECLARATION -> ENTITY_DECLARATION;
                default -> throw new IllegalStateException("Not defined element type!. Value: " + value);
            };
        }
    }
}
