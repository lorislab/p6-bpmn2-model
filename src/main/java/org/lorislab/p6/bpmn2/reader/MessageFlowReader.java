package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_SOURCE_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_TARGET_REF;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.MessageFlow;

public class MessageFlowReader extends BaseElementReader<MessageFlow> {

    private static final QName ATTR_MESSAGE_REF = new QName("messageRef");

    public MessageFlowReader() {
        super(MessageFlow::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, MessageFlow element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // sourceRef
        element.setSourceRef(attrs.getString(ATTR_SOURCE_REF, true));
        // targetRef
        element.setTargetRef(attrs.getString(ATTR_TARGET_REF, true));
        // messageRef
        element.setMessageRef(attrs.getString(ATTR_MESSAGE_REF));
    }

}
