package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.MessageFlowAssociation;

public class MessageFlowAssociationReader extends BaseElementReader<MessageFlowAssociation> {

    private static final QName ATTR_INNER_MESSAGE_FLOW = new QName("innerMessageFlowRef");
    private static final QName ATTR_OUTER_MESSAGE_FLOW = new QName("outerMessageFlowRef");

    public MessageFlowAssociationReader() {
        super(MessageFlowAssociation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, MessageFlowAssociation element) throws Exception {
        super.readAttrs(attrs, element);
        // innerMessageFlowRef
        element.setInnerMessageFlowRef(attrs.getString(ATTR_INNER_MESSAGE_FLOW, true));
        // outerMessageFlowRef
        element.setOuterMessageFlowRef(attrs.getString(ATTR_OUTER_MESSAGE_FLOW, true));
    }

}
