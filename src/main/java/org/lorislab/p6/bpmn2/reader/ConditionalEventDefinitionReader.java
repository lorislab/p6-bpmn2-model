package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ConditionalEventDefinition;

public class ConditionalEventDefinitionReader extends EventDefinitionReader<ConditionalEventDefinition> {
    public ConditionalEventDefinitionReader() {
        super(ConditionalEventDefinition::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ConditionalEventDefinition element) throws Exception {
        super.readElement(reader, name, element);
        // condition
        readElementSequenceItem(EXPRESSION_READER, reader, "condition", element::setCondition, true);
    }
}
