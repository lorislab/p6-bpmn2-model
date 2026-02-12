package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_SOURCE_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_TARGET_REF;

import org.lorislab.p6.bpmn2.model.ConversationLink;

public class ConversationLinkReader extends BaseElementReader<ConversationLink> {

    public ConversationLinkReader() {
        super(ConversationLink::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ConversationLink element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // sourceRef
        element.setSourceRef(attrs.getString(ATTR_SOURCE_REF, true));
        // targetRef
        element.setTargetRef(attrs.getString(ATTR_TARGET_REF, true));
    }

}
