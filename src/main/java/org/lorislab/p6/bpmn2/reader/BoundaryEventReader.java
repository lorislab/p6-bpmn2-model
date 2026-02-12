package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ATTACHED_TO_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_CANCEL_ACTIVITY;

import org.lorislab.p6.bpmn2.model.BoundaryEvent;

public class BoundaryEventReader extends CatchEventReader<BoundaryEvent> {
    public BoundaryEventReader() {
        super(BoundaryEvent::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, BoundaryEvent element) throws Exception {
        super.readAttrs(attrs, element);
        // cancelActivity
        element.setCancelActivity(attrs.getBoolean(ATTR_CANCEL_ACTIVITY, true));
        // attachedToRef
        element.setAttachedToRef(attrs.getString(ATTR_ATTACHED_TO_REF));
    }
}
