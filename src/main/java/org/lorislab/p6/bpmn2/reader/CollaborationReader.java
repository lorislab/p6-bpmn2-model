package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Collaboration;

public class CollaborationReader extends RootElementReader<Collaboration> {

    public CollaborationReader() {
        super(Collaboration::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Collaboration element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // isClosed
        element.setClosed(attrs.getBoolean(AttributeReader.ATTR_IS_CLOSED, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Collaboration element) throws Exception {
        super.readElement(reader, name, element);
        // participant
        readElementSequence(PARTICIPANT_READER, reader, "participant", element.getParticipant());
        // messageFlow
        readElementSequence(MESSAGE_FLOW_READER, reader, "messageFlow", element.getMessageFlow());
        // artifact
        ReaderItems.readArtifacts(reader, element.getArtifact());
        // conversationNode
        ReaderItems.readConversationNodes(reader, element.getConversationNode());
        // conversationAssociation
        readElementSequence(CONVERSATION_ASSOCIATION_READER, reader, "conversationAssociation",
                element.getConversationAssociation());
        // participantAssociation
        readElementSequence(PARTICIPANT_ASSOCIATION_READER, reader, "participantAssociation",
                element.getParticipantAssociation());
        // messageFlowAssociation
        readElementSequence(MESSAGE_FLOW_ASSOCIATION_READER, reader, "messageFlowAssociation",
                element.getMessageFlowAssociation());
        // correlationKey
        readElementSequence(CORRELATION_KEY_READER, reader, "correlationKey", element.getCorrelationKey());
        // choreographyRef
        readTextElementList(reader, "choreographyRef", element.getChoreographyRef());
        // conversationLink
        readElementSequence(CONVERSATION_LINK_READER, reader, "conversationLink", element.getConversationLink());
    }

}
