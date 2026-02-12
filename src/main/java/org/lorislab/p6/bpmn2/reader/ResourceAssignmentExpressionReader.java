package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ResourceAssignmentExpression;

public class ResourceAssignmentExpressionReader extends BaseElementReader<ResourceAssignmentExpression> {

    public ResourceAssignmentExpressionReader() {
        super(ResourceAssignmentExpression::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ResourceAssignmentExpression element) throws Exception {
        super.readElement(reader, name, element);
        // expression
        var localName = reader.getLocalName();
        switch (localName) {
            case "expression" -> readElementSequenceItem(EXPRESSION_READER, reader, localName, element::setExpression, true);
            case "formalExpression" ->
                readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, localName, element::setExpression, true);
        }
    }

}
