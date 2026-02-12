package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.TEXT_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.TextAnnotation;

public class TextAnnotationReader extends ArtifactReader<TextAnnotation> {

    private static final QName ATTR_TEXT_FORMAT = new QName("textFormat");

    public TextAnnotationReader() {
        super(TextAnnotation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, TextAnnotation element) throws Exception {
        super.readAttrs(attrs, element);
        // textFormat
        element.setTextFormat(attrs.getString(ATTR_TEXT_FORMAT, "text/plain"));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, TextAnnotation element) throws Exception {
        super.readElement(reader, name, element);
        // text
        readElementSequenceItem(TEXT_READER, reader, "text", element::setText);
    }
}
