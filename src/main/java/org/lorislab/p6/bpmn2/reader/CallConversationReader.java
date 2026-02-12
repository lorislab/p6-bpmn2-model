package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.PARTICIPANT_ASSOCIATION_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CallConversation;

public class CallConversationReader extends ConversationNodeReader<CallConversation> {

    private static final QName ATTR_CALLED_COLLABORATION_REF = new QName("calledCollaborationRef");

    public CallConversationReader() {
        super(CallConversation::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CallConversation element) throws Exception {
        super.readAttrs(attrs, element);
        // calledCollaborationRef
        element.setCalledCollaborationRef(attrs.getString(ATTR_CALLED_COLLABORATION_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CallConversation element) throws Exception {
        super.readElement(reader, name, element);
        // participantAssociation
        readElementSequence(PARTICIPANT_ASSOCIATION_READER, reader, "participantAssociation",
                element.getParticipantAssociation());
    }
}
