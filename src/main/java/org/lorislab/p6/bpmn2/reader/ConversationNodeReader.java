package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.CORRELATION_KEY_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ConversationNode;

public class ConversationNodeReader<T extends ConversationNode> extends BaseElementReader<T> {

    public ConversationNodeReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // participantRef
        readTextElementList(reader, "participantRef", element.getParticipantRef());
        // messageFlowRef
        readTextElementList(reader, "messageFlowRef", element.getMessageFlowRef());
        // correlationKey
        readElementSequence(CORRELATION_KEY_READER, reader, "correlationKey", element.getCorrelationKey());
    }

}
