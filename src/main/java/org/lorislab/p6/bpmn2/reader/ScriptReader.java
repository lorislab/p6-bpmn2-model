package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Script;

public class ScriptReader extends Reader<Script> {

    public ScriptReader() {
        super(Script::new, true);
    }

    @Override
    protected void readMixedContent(XMLStreamReader2 reader, String name, Script element) throws Exception {
        super.readMixedContent(reader, name, element);
        readMixedContentValue(reader, name, element, element::setContent);
    }

    protected void readMixedContentElement(XMLStreamReader2 reader, String name, Script element) throws Exception {
        var childName = reader.getLocalName();
        while (!isEndElement(reader, childName)) {
            var child = reader.getName();
            element.getAny().put(child, Writer.getRawXmlFromCurrentElement(reader));
        }
    }
}
