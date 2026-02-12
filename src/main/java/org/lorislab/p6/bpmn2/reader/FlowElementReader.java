package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.AUDITING_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.MONITORING_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.FlowElement;

public abstract class FlowElementReader<T extends FlowElement<?>> extends BaseElementReader<T> {

    public FlowElementReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // auditing
        readElementSequenceItem(AUDITING_READER, reader, "auditing", element::setAuditing);
        // monitoring
        readElementSequenceItem(MONITORING_READER, reader, "monitoring", element::setMonitoring);
        // categoryValueRef
        readTextElementList(reader, "categoryValueRef", element.getCategoryValueRefs());
    }
}
