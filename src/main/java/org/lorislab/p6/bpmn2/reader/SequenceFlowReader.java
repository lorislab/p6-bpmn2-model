package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_IS_IMMEDIATE;
import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.SequenceFlow;

public class SequenceFlowReader extends FlowElementReader<SequenceFlow> {

    public SequenceFlowReader() {
        super(SequenceFlow::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, SequenceFlow element) throws Exception {
        super.readAttrs(attrs, element);
        // sourceRef
        element.setSourceRef(attrs.getString(AttributeReader.ATTR_SOURCE_REF, true));
        // targetRef
        element.setTargetRef(attrs.getString(AttributeReader.ATTR_TARGET_REF, true));
        // isImmediate
        element.setImmediate(attrs.getBoolean(ATTR_IS_IMMEDIATE));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, SequenceFlow element) throws Exception {
        super.readElement(reader, name, element);
        // conditionExpression
        readElementSequenceItem(EXPRESSION_READER, reader, "conditionExpression", element::setConditionExpression);
    }
}
