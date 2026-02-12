package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;

import org.lorislab.p6.bpmn2.model.DataState;

public class DataStateReader extends BaseElementReader<DataState> {

    public DataStateReader() {
        super(DataState::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, DataState element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
    }

}
