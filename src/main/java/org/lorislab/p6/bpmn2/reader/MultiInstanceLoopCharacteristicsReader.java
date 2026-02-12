package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;
import static org.lorislab.p6.bpmn2.reader.Readers.*;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.MultiInstanceLoopCharacteristics;

public class MultiInstanceLoopCharacteristicsReader extends BaseElementReader<MultiInstanceLoopCharacteristics> {

    public MultiInstanceLoopCharacteristicsReader() {
        super(MultiInstanceLoopCharacteristics::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, MultiInstanceLoopCharacteristics element) throws Exception {
        super.readAttrs(attrs, element);
        // isSequential
        element.setSequential(attrs.getBoolean(ATTR_IS_SEQUENTIAL, false));
        // behavior
        element.setBehavior(attrs.getEnum(ATTR_BEHAVIOR, MultiInstanceLoopCharacteristics.MultiInstanceFlowCondition.class,
                MultiInstanceLoopCharacteristics.MultiInstanceFlowCondition.All));
        // oneBehaviorEventRef
        element.setOneBehaviorEventRef(attrs.getString(ATTR_ONE_BEHAVIOR_EVENT_REF));
        // noneBehaviorEventRef
        element.setNoneBehaviorEventRef(attrs.getString(ATTR_NONE_BEHAVIOR_EVENT_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, MultiInstanceLoopCharacteristics element)
            throws Exception {
        super.readElement(reader, name, element);
        // loopCardinality
        readElementSequenceItem(EXPRESSION_READER, reader, "loopCardinality", element::setLoopCardinality);
        // loopDataInputRef
        readTextElement(reader, "loopDataInputRef", element::setLoopDataInputRef);
        // loopDataOutputRef
        readTextElement(reader, "loopDataOutputRef", element::setLoopDataOutputRef);
        // inputDataItem
        readElementSequenceItem(DATA_INPUT_READER, reader, "inputDataItem", element::setInputDataItem);
        // outputDataItem
        readElementSequenceItem(DATA_OUTPUT_READER, reader, "outputDataItem", element::setOutputDataItem);
        // complexBehaviorDefinition
        readElementSequence(COMPLEX_BEHAVIOR_DEFINITION_READER, reader, "complexBehaviorDefinition",
                element.getComplexBehaviorDefinition());
        // completionCondition
        readElementSequenceItem(EXPRESSION_READER, reader, "completionCondition", element::setCompletionCondition);
    }
}
