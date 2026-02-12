package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_DATA_OBJECT_REF;
import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STATE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataObjectReference;

public class DataObjectReferenceReader extends FlowElementReader<DataObjectReference> {

    public DataObjectReferenceReader() {
        super(DataObjectReference::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataObjectReference element) throws Exception {
        super.readAttrs(attrs, element);
        // itemSubjectRef
        element.setItemSubjectRef(attrs.getString(AttributeReader.ATTR_ITEM_SUBJECT_REF));
        // dataObjectRef
        element.setDataObjectRef(attrs.getString(ATTR_DATA_OBJECT_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, DataObjectReference element) throws Exception {
        super.readElement(reader, name, element);
        // dataState
        readElementSequenceItem(DATA_STATE_READER, reader, "dataState", element::setDataState);
    }
}
