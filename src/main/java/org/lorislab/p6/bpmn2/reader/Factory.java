package org.lorislab.p6.bpmn2.reader;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import org.codehaus.stax2.XMLInputFactory2;
import org.codehaus.stax2.XMLOutputFactory2;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.XMLStreamWriter2;

public class Factory {

    private static final XMLInputFactory2 XML_INPUT_FACTORY = (XMLInputFactory2) XMLInputFactory2.newInstance();

    private static final XMLOutputFactory2 XML_OUTPUT_FACTORY = (XMLOutputFactory2) XMLOutputFactory2.newInstance();

    public static XMLStreamReader2 createReader(byte[] data) throws Exception {
        return (XMLStreamReader2) XML_INPUT_FACTORY.createXMLStreamReader(new ByteArrayInputStream(data));
    }

    public static XMLStreamWriter2 createWriter(StringWriter writer) throws Exception {
        return (XMLStreamWriter2) XML_OUTPUT_FACTORY.createXMLStreamWriter(writer);
    }
}
