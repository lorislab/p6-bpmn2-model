package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_PARALLEL_MULTIPLE;
import static org.lorislab.p6.bpmn2.reader.Readers.*;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CatchEvent;

public class CatchEventReader<T extends CatchEvent> extends EventReader<T> {

    public CatchEventReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // parallelMultiple
        element.setParallelMultiple(attrs.getBoolean(ATTR_PARALLEL_MULTIPLE, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // dataOutput
        readElementSequence(DATA_OUTPUT_READER, reader, "dataOutput", element.getDataOutput());
        // dataOutputAssociation
        readElementSequence(DATA_OUTPUT_ASSOCIATION_READER, reader, "dataOutputAssociation",
                element.getDataOutputAssociation());
        // outputSet
        readElementSequenceItem(OUTPUT_SET_READER, reader, "outputSet", element::setOutputSet);
        // eventDefinition
        ReaderItems.readEventDefinitions(reader, element.getEventDefinition());
        // eventDefinitionRef
        readTextElementList(reader, "eventDefinitionRef", element.getEventDefinitionRef());
    }
}
