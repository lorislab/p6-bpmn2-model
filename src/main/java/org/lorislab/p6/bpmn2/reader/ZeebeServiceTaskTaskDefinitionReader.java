package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskTaskDefinitionReader extends Reader<ServiceTaskExtensionElements.ZeebeTaskDefinition> {

    protected static final QName ATTR_TYPE = new QName("type");
    protected static final QName ATTR_RETRIES = new QName("retries");

    public ZeebeServiceTaskTaskDefinitionReader() {
        super(ServiceTaskExtensionElements.ZeebeTaskDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeTaskDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // type
        element.setType(attrs.getString(ATTR_TYPE));
        // retries
        element.setRetries(attrs.getString(ATTR_RETRIES));
    }
}
