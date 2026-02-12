package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;

import org.lorislab.p6.bpmn2.model.Message;

public class MessageReader extends RootElementReader<Message> {

    public MessageReader() {
        super(Message::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Message element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME));
        // itemRef
        element.setItemRef(attrs.getString(ATTR_ITEM_REF));
    }

}
