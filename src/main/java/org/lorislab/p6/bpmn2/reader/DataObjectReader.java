package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataObject;

public class DataObjectReader extends FlowElementReader<DataObject> {

    public DataObjectReader() {
        super(DataObject::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataObject element) throws Exception {
        super.readAttrs(attrs, element);
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(AttributeReader.ATTR_ITEM_SUBJECT_REF));
        // isCollection
        element.setCollection(attrs.getBoolean(AttributeReader.ATTR_IS_COLLECTION, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, DataObject element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "dataState", element::setDataState);
    }
}
