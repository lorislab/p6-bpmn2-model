package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_MESSAGE_REF;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.MessageEventDefinition;

public class MessageEventDefinitionReader extends EventDefinitionReader<MessageEventDefinition> {

    public MessageEventDefinitionReader() {
        super(MessageEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, MessageEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // messageRef
        element.setMessageRef(attrs.getString(ATTR_MESSAGE_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, MessageEventDefinition element) throws Exception {
        super.readElement(reader, name, element);
        // operationRef
        readTextElement(reader, "operationRef", element::setOperationRef);
    }
}
