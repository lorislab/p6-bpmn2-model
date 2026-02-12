package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskPropertyReader extends Reader<ServiceTaskExtensionElements.ZeebeProperty> {

    protected static final QName ATTR_NAME = new QName("name");
    protected static final QName ATTR_VALUE = new QName("value");

    public ZeebeServiceTaskPropertyReader() {
        super(ServiceTaskExtensionElements.ZeebeProperty::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeProperty element) throws Exception {
        super.readAttrs(attrs, element);
        // key
        element.setName(attrs.getString(ATTR_NAME));
        // value
        element.setValue(attrs.getString(ATTR_VALUE));
    }
}
