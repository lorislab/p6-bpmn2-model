package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ERROR_REF;

import org.lorislab.p6.bpmn2.model.ErrorEventDefinition;

public class ErrorEventDefinitionReader extends EventDefinitionReader<ErrorEventDefinition> {

    public ErrorEventDefinitionReader() {
        super(ErrorEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ErrorEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // errorRef
        element.setErrorRef(attrs.getString(ATTR_ERROR_REF));
    }
}
