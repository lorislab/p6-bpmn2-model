package org.lorislab.p6.bpmn2.reader;

import java.util.function.Consumer;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ExtensionElements;

public class ExtensionElementsReader extends Reader<ExtensionElements> {

    public ExtensionElementsReader() {
        super(ExtensionElements::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ExtensionElements> fn) throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }
        skipToEndElement(reader, name);
        return true;
    }
}
