package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.ProcessExtensionElements;

public class ZeebeVersionTagReader extends Reader<ProcessExtensionElements.ZeebeVersionTag> {

    protected static final QName ATTR_VALUE = new QName("value");

    public ZeebeVersionTagReader() {
        super(ProcessExtensionElements.ZeebeVersionTag::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ProcessExtensionElements.ZeebeVersionTag element) throws Exception {
        super.readAttrs(attrs, element);
        // value
        element.setValue(attrs.getString(ATTR_VALUE));
    }
}
