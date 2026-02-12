package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ServiceTaskExtensionElements;

public class ZeebeServiceTaskExecutionListenerReader extends Reader<ServiceTaskExtensionElements.ZeebeExecutionListener> {

    protected static final QName ATTR_EVENT_TYPE = new QName("eventType");
    protected static final QName ATTR_RETRIES = new QName("retries");
    protected static final QName ATTR_TYPE = new QName("type");

    public ZeebeServiceTaskExecutionListenerReader() {
        super(ServiceTaskExtensionElements.ZeebeExecutionListener::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ServiceTaskExtensionElements.ZeebeExecutionListener element)
            throws Exception {
        super.readAttrs(attrs, element);
        // eventType
        element.setEvent(attrs.getString(ATTR_EVENT_TYPE));
        // retries
        element.setRetries(attrs.getInteger(ATTR_RETRIES));
        // type
        element.setType(attrs.getString(ATTR_TYPE));
    }
}
