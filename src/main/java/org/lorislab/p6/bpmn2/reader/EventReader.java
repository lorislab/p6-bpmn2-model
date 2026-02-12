package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.PROPERTY_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Event;

public class EventReader<T extends Event> extends FlowNodeReader<T> {

    public EventReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // property
        readElementSequence(PROPERTY_READER, reader, "property", element.getProperty());
    }
}
