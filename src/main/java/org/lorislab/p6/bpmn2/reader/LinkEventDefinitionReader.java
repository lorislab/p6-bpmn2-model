package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.LinkEventDefinition;

public class LinkEventDefinitionReader extends EventDefinitionReader<LinkEventDefinition> {

    public LinkEventDefinitionReader() {
        super(LinkEventDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, LinkEventDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        element.setName(attrs.getString(AttributeReader.ATTR_NAME, true));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, LinkEventDefinition element) throws Exception {
        super.readElement(reader, name, element);
        // source
        readTextElementList(reader, "source", element.getSource());
        // target
        readTextElement(reader, "target", element::setTarget);
    }
}
