package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.PARTICIPANT_MULTIPLICITY_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Participant;

public class ParticipantReader extends BaseElementReader<Participant> {

    private static final QName ATTR_PROCESS_REF = new QName("processRef");

    public ParticipantReader() {
        super(Participant::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Participant element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // processRef
        element.setProcessRef(attrs.getString(ATTR_PROCESS_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Participant element) throws Exception {
        super.readElement(reader, name, element);
        // interfaceRef
        readTextElementList(reader, "interfaceRef", element.getInterfaceRef());
        // endPointRef
        readTextElementList(reader, "endPointRef", element.getEndPointRef());
        // participantMultiplicity
        readElementSequenceItem(PARTICIPANT_MULTIPLICITY_READER, reader, "participantMultiplicity",
                element::setParticipantMultiplicity);
    }

}
