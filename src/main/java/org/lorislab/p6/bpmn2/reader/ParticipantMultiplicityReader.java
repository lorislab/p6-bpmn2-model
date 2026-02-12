package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ParticipantMultiplicity;

public class ParticipantMultiplicityReader extends BaseElementReader<ParticipantMultiplicity> {

    private static final QName ATTR_MINIMUM = new QName("minimum");
    private static final QName ATTR_MAXIMUM = new QName("maximum");

    public ParticipantMultiplicityReader() {
        super(ParticipantMultiplicity::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ParticipantMultiplicity element) throws Exception {
        super.readAttrs(attrs, element);
        // minimum
        element.setMinimum(attrs.getInteger(ATTR_MINIMUM, 0));
        // maximum
        element.setMaximum(attrs.getInteger(ATTR_MAXIMUM, 1));
    }

}
