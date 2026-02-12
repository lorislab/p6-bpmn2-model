package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_DATA_STORE_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ITEM_SUBJECT_REF;
import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataStoreReference;

public class DataStoreReferenceReader extends FlowElementReader<DataStoreReference> {

    public DataStoreReferenceReader() {
        super(DataStoreReference::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataStoreReference element) throws Exception {
        super.readAttrs(attrs, element);
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(ATTR_ITEM_SUBJECT_REF));
        // dataStoreRef
        element.setDataStoreRef(attrs.getString(ATTR_DATA_STORE_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, DataStoreReference element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "", element::setDataState);
    }
}
