package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ThrowEvent;

public class ThrowEventReader<T extends ThrowEvent> extends EventReader<T> {

    public ThrowEventReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // dataInput
        readElementSequence(DATA_INPUT_READER, reader, "dataInput", element.getDataInput());
        // dataInputAssociation
        readElementSequence(DATA_INPUT_ASSOCIATION_READER, reader, "dataInputAssociation", element.getDataInputAssociation());
        // inputSet
        readElementSequenceItem(INPUT_SET_READER, reader, "inputSet", element::setInputSet);
        // eventDefinition
        ReaderItems.readEventDefinitions(reader, element.getEventDefinition());
        // eventDefinitionRef
        readTextElementList(reader, "eventDefinitionRef", element.getEventDefinitionRef());
    }
}
