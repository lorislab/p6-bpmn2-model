package org.lorislab.p6.bpmn2.reader;

import java.io.StringWriter;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamWriter;

import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.XMLStreamWriter2;

public class Writer {

    public static String getRawXmlFromCurrentElement(XMLStreamReader2 reader) throws Exception {
        StringWriter stringWriter = new StringWriter();
        XMLStreamWriter2 writer = Factory.createWriter(stringWriter);

        int depth = 0;

        if (reader.getEventType() != XMLStreamConstants.START_ELEMENT) {
            throw new IllegalStateException("Reader must be at START_ELEMENT");
        }

        do {
            switch (reader.getEventType()) {
                case XMLStreamConstants.START_ELEMENT:
                    depth++;
                    writeStartElement(reader, writer);
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    writer.writeEndElement();
                    depth--;
                    break;
                case XMLStreamConstants.CHARACTERS:
                    writer.writeCharacters(reader.getText());
                    break;
                case XMLStreamConstants.CDATA:
                    writer.writeCData(reader.getText());
                    break;
                case XMLStreamConstants.COMMENT:
                    writer.writeComment(reader.getText());
                    break;
                case XMLStreamConstants.PROCESSING_INSTRUCTION:
                    writer.writeProcessingInstruction(reader.getPITarget(), reader.getPIData());
                    break;
                default:
                    break;
            }

            if (depth > 0) {
                reader.next();
            }
        } while (depth > 0);

        writer.flush();
        return stringWriter.toString();
    }

    private static void writeStartElement(XMLStreamReader2 reader, XMLStreamWriter writer) throws Exception {
        String prefix = reader.getPrefix();
        String localName = reader.getLocalName();
        String namespaceURI = reader.getNamespaceURI();

        if (namespaceURI != null && !namespaceURI.isEmpty()) {
            writer.writeStartElement(prefix, localName, namespaceURI);
        } else {
            writer.writeStartElement(localName);
        }

        // Write namespaces
        for (int i = 0; i < reader.getNamespaceCount(); i++) {
            writer.writeNamespace(reader.getNamespacePrefix(i), reader.getNamespaceURI(i));
        }

        // Write attributes
        for (int i = 0; i < reader.getAttributeCount(); i++) {
            String attrPrefix = reader.getAttributePrefix(i);
            String attrNamespace = reader.getAttributeNamespace(i);
            String attrLocalName = reader.getAttributeLocalName(i);
            String attrValue = reader.getAttributeValue(i);

            if (attrNamespace != null && !attrNamespace.isEmpty()) {
                writer.writeAttribute(attrPrefix, attrNamespace, attrLocalName, attrValue);
            } else {
                writer.writeAttribute(attrLocalName, attrValue);
            }
        }
    }
}
