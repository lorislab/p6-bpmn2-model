package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ID;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Documentation;

public class DocumentationReader extends Reader<Documentation> {

    private static final QName ATTR_TEXT_FORMAT = new QName(null, "textFormat");

    public DocumentationReader() {
        super(Documentation::new, true);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Documentation element) throws Exception {
        element.setId(attrs.getString(ATTR_ID, false));
        element.setTextFormat(attrs.getString(ATTR_TEXT_FORMAT, "text/plain"));
    }

    @Override
    protected void readMixedContent(XMLStreamReader2 reader, String name, Documentation element) throws Exception {
        super.readMixedContent(reader, name, element);
        readMixedContentValue(reader, name, element, element::setContent);
    }

    protected void readMixedContentElement(XMLStreamReader2 reader, String name, Documentation element) throws Exception {
        var childName = reader.getLocalName();
        while (!isEndElement(reader, childName)) {
            var child = reader.getName();
            element.getAny().put(child, Writer.getRawXmlFromCurrentElement(reader));
        }
    }
}
