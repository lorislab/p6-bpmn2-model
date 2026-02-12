package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ITEM_SUBJECT_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Property;

public class PropertyReader extends BaseElementReader<Property> {

    public PropertyReader() {
        super(Property::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Property element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(ATTR_ITEM_SUBJECT_REF, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Property element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "dataState", element::setDataState);
    }

}
