package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ESCALATION_REF;

import org.lorislab.p6.bpmn2.model.EscalationEventDefinition;

public class EscalationEventDefinitionReader extends EventDefinitionReader<EscalationEventDefinition> {
    public EscalationEventDefinitionReader() {
        super(EscalationEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, EscalationEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // escalationRef
        element.setEscalationRef(attrs.getString(ATTR_ESCALATION_REF));
    }
}
