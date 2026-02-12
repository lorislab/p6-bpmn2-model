package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CallChoreography;

public class CallChoreographyReader extends ChoreographyActivityReader<CallChoreography> {

    public CallChoreographyReader() {
        super(CallChoreography::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CallChoreography element) throws Exception {
        super.readAttrs(attrs, element);
        // calledChoreographyRef
        element.setId(attrs.getString(AttributeReader.ATTR_CALLED_CHOREOGRAPHY_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, CallChoreography element) throws Exception {
        super.readElement(reader, name, element);
        // participantAssociation
        readElementSequence(Readers.PARTICIPANT_ASSOCIATION_READER, reader, "participantAssociation",
                element.getParticipantAssociation());
    }
}
