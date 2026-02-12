package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskIOMappingOutputReader extends Reader<ServiceTaskExtensionElements.ZeebeIOMappingOutput> {

    protected static final QName ATTR_SOURCE = new QName("source");
    protected static final QName ATTR_TARGET = new QName("target");

    public ZeebeServiceTaskIOMappingOutputReader() {
        super(ServiceTaskExtensionElements.ZeebeIOMappingOutput::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeIOMappingOutput element)
            throws Exception {
        super.readAttrs(attrs, element);
        // key
        element.setSource(attrs.getString(ATTR_SOURCE));
        // value
        element.setTarget(attrs.getString(ATTR_TARGET));
    }
}
