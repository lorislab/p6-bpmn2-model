package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_SIGNAL_REF;

import org.lorislab.p6.bpmn2.model.SignalEventDefinition;

public class SignalEventDefinitionReader extends EventDefinitionReader<SignalEventDefinition> {

    public SignalEventDefinitionReader() {
        super(SignalEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, SignalEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // signalRef
        element.setSignalRef(attrs.getString(ATTR_SIGNAL_REF));
    }
}
