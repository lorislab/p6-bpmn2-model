package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.PartnerEntity;

public class PartnerEntityReader extends RootElementReader<PartnerEntity> {

    public PartnerEntityReader() {
        super(PartnerEntity::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, PartnerEntity element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, PartnerEntity element) throws Exception {
        super.readElement(reader, name, element);
        // participantRef
        readTextElementList(reader, "participantRef", element.getParticipantRef());
    }
}
