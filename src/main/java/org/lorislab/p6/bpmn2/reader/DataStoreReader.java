package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataStore;

public class DataStoreReader extends RootElementReader<DataStore> {

    public DataStoreReader() {
        super(DataStore::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataStore element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // capacity
        element.setCapacity(attrs.getInteger(AttributeReader.ATTR_CAPACITY));
        // isUnlimited
        element.setUnlimited(attrs.getBoolean(AttributeReader.ATTR_IS_UNLIMITED, true));
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(AttributeReader.ATTR_ITEM_SUBJECT_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, DataStore element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "", element::setDataState);
    }
}
