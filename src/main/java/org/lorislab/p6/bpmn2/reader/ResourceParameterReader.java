package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.ResourceParameter;

public class ResourceParameterReader extends BaseElementReader<ResourceParameter> {

    public ResourceParameterReader() {
        super(ResourceParameter::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ResourceParameter element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
        // type
        element.setType(attrs.getString(AttributeReader.ATTR_TYPE));
        // isRequired
        element.setRequired(attrs.getBoolean(AttributeReader.ATTR_IS_REQUIRED, false));
    }

}
