package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.Error;

public class ErrorReader extends RootElementReader<Error> {

    public ErrorReader() {
        super(Error::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Error element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // errorCode
        element.setErrorCode(attrs.getString(AttributeReader.ATTR_ERROR_CODE));
        // structureRef
        element.setStructureRef(attrs.getString(AttributeReader.ATTR_STRUCTURE_REF));
    }
}
