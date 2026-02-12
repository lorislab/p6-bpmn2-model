package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ParticipantAssociation;

public class ParticipantAssociationReader extends BaseElementReader<ParticipantAssociation> {

    public ParticipantAssociationReader() {
        super(ParticipantAssociation::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ParticipantAssociation element) throws Exception {
        super.readElement(reader, name, element);
        // innerParticipantRef
        readTextElement(reader, "innerParticipantRef", element::setInnerParticipantRef, true);
        // outerParticipantRef
        readTextElement(reader, "outerParticipantRef", element::setOuterParticipantRef, true);
    }

}
