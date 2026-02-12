package org.lorislab.p6.bpmn2.reader;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.FlowNode;

public abstract class FlowNodeReader<T extends FlowNode<?>> extends FlowElementReader<T> {

    public FlowNodeReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // incoming
        readTextElementList(reader, "incoming", element.getIncoming());
        // outgoing
        readTextElementList(reader, "outgoing", element.getOutgoing());
    }
}
