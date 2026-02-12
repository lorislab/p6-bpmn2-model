package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ESCALATION_CODE;

import org.lorislab.p6.bpmn2.model.Escalation;

public class EscalationReader extends RootElementReader<Escalation> {

    public EscalationReader() {
        super(Escalation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Escalation element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // escalationCode
        element.setEscalationCode(attrs.getString(ATTR_ESCALATION_CODE));
        // structureRef
        element.setStructureRef(attrs.getString(AttributeReader.ATTR_STRUCTURE_REF));
    }
}
