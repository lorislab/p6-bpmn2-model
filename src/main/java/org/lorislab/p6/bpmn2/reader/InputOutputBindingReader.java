package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;

import org.lorislab.p6.bpmn2.model.InputOutputBinding;

public class InputOutputBindingReader extends BaseElementReader<InputOutputBinding> {

    public InputOutputBindingReader() {
        super(InputOutputBinding::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, InputOutputBinding element) throws Exception {
        super.readAttrs(attrs, element);
        element.setOperationRef(attrs.getString(ATTR_OPERATION_REF, true));
        element.setInputDataRef(attrs.getString(ATTR_INPUT_DATA_REF, true));
        element.setOutputDataRef(attrs.getString(ATTR_OUTPUT_DATA_REF, true));
    }

}
