package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ConversationAssociation;

public class ConversationAssociationReader extends BaseElementReader<ConversationAssociation> {

    private static final QName ATTR_INNER = new QName("innerConversationNodeRef");
    private static final QName ATTR_OUTER = new QName("outerConversationNodeRef");

    public ConversationAssociationReader() {
        super(ConversationAssociation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ConversationAssociation element) throws Exception {
        super.readAttrs(attrs, element);
        // innerConversationNodeRef
        element.setInnerConversationNodeRef(attrs.getString(ATTR_INNER, true));
        // outerConversationNodeRef
        element.setOuterConversationNodeRef(attrs.getString(ATTR_OUTER, true));
    }

}
