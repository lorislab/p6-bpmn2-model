package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.SubConversation;

public class SubConversationReader extends ConversationNodeReader<SubConversation> {

    public SubConversationReader() {
        super(SubConversation::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, SubConversation element) throws Exception {
        super.readElement(reader, name, element);
        // conversationNode
        ReaderItems.readConversationNodes(reader, element.getConversationMode());
    }
}
