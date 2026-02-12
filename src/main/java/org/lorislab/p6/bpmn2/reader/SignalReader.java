package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_STRUCTURE_REF;

import org.lorislab.p6.bpmn2.model.Signal;

public class SignalReader extends RootElementReader<Signal> {

    public SignalReader() {
        super(Signal::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Signal element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME));
        // structureRef
        element.setStructureRef(attrs.getString(ATTR_STRUCTURE_REF));
    }

}
