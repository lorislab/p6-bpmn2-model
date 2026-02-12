package org.lorislab.p6.bpmn2.reader;

import java.util.function.Consumer;

import org.codehaus.stax2.XMLStreamReader2;

public class BPMNDiagramReader extends Reader<Object> {

    public BPMNDiagramReader() {
        super(() -> null);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<Object> fn) throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }
        skipToEndElement(reader, name);
        return true;
    }
}
