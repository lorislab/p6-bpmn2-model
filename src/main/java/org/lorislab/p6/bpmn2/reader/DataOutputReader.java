package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;
import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataOutput;

public class DataOutputReader extends BaseElementReader<DataOutput> {

    public DataOutputReader() {
        super(DataOutput::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataOutput element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME));
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(ATTR_ITEM_SUBJECT_REF, false));
        // isCollection
        element.setCollection(attrs.getBoolean(ATTR_IS_COLLECTION, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, DataOutput element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "dataState", element::setDataState);
    }

}
