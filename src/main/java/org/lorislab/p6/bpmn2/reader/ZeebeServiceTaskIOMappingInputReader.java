package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskIOMappingInputReader extends Reader<ServiceTaskExtensionElements.ZeebeIOMappingInput> {

    protected static final QName ATTR_SOURCE = new QName("source");
    protected static final QName ATTR_TARGET = new QName("target");

    public ZeebeServiceTaskIOMappingInputReader() {
        super(ServiceTaskExtensionElements.ZeebeIOMappingInput::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeIOMappingInput element) throws Exception {
        super.readAttrs(attrs, element);
        // key
        element.setSource(attrs.getString(ATTR_SOURCE));
        // value
        element.setTarget(attrs.getString(ATTR_TARGET));
    }
}
