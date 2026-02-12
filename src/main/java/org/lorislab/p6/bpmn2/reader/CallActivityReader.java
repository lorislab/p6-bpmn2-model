package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_CALLED_ELEMENT;

import org.lorislab.p6.bpmn2.model.CallActivity;

public class CallActivityReader extends ActivityReader<CallActivity> {

    public CallActivityReader() {
        super(CallActivity::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CallActivity element) throws Exception {
        super.readAttrs(attrs, element);
        // calledElement
        element.setCalledElement(attrs.getString(ATTR_CALLED_ELEMENT));
    }
}
