package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ComplexBehaviorDefinition;

public class ComplexBehaviorDefinitionReader extends BaseElementReader<ComplexBehaviorDefinition> {

    public ComplexBehaviorDefinitionReader() {
        super(ComplexBehaviorDefinition::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ComplexBehaviorDefinition element) throws Exception {
        super.readElement(reader, name, element);
        // condition
        readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, "condition", element::setCondition, true);
        // event
        readElementSequenceItem(IMPLICIT_THROW_EVENT_READER, reader, "event", element::setEvent);
    }
}
