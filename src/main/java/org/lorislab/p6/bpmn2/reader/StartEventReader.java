package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_IS_INTERRUPTING;

import org.lorislab.p6.bpmn2.model.StartEvent;

public class StartEventReader extends CatchEventReader<StartEvent> {

    public StartEventReader() {
        super(StartEvent::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, StartEvent element) throws Exception {
        super.readAttrs(attrs, element);
        // isInterrupting
        element.setInterrupting(attrs.getBoolean(ATTR_IS_INTERRUPTING, true));
    }
}
