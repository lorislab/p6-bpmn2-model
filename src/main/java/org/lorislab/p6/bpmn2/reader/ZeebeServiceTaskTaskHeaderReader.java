package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskTaskHeaderReader extends Reader<ServiceTaskExtensionElements.ZeebeTaskHeader> {

    protected static final QName ATTR_KEY = new QName("key");
    protected static final QName ATTR_VALUE = new QName("value");

    public ZeebeServiceTaskTaskHeaderReader() {
        super(ServiceTaskExtensionElements.ZeebeTaskHeader::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeTaskHeader element) throws Exception {
        super.readAttrs(attrs, element);
        // key
        element.setKey(attrs.getString(ATTR_KEY));
        // value
        element.setValue(attrs.getString(ATTR_VALUE));
    }
}
