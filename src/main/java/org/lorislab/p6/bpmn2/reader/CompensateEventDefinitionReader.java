package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ACTIVITY_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_WAIT_FOR_COMPLETION;

import org.lorislab.p6.bpmn2.model.CompensateEventDefinition;

public class CompensateEventDefinitionReader extends EventDefinitionReader<CompensateEventDefinition> {
    public CompensateEventDefinitionReader() {
        super(CompensateEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CompensateEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // waitForCompletion
        element.setWaitForCompletion(attrs.getBoolean(ATTR_WAIT_FOR_COMPLETION));
        // activityRef
        element.setActivityRef(attrs.getString(ATTR_ACTIVITY_REF));
    }
}
