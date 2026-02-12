package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.PartnerRole;

public class PartnerRoleReader extends RootElementReader<PartnerRole> {

    public PartnerRoleReader() {
        super(PartnerRole::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, PartnerRole element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, PartnerRole element) throws Exception {
        super.readElement(reader, name, element);
        // participantRef
        readTextElementList(reader, "participantRef", element.getParticipantRef());
    }
}
