package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.RESOURCE_ASSIGNMENT_EXPRESSION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.RESOURCE_PARAMETER_BINDING_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ResourceRole;

public class ResourceRoleReader<T extends ResourceRole> extends BaseElementReader<T> {

    public ResourceRoleReader(Supplier<T> supplier) {
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
        var localName = reader.getLocalName();
        switch (localName) {
            case "resourceRef" -> {
                // resourceRef
                readTextElement(reader, "resourceRef", element::setResourceRef, true);
                // resourceParameterBinding
                readElementSequence(RESOURCE_PARAMETER_BINDING_READER, reader, "resourceParameterBinding",
                        element.getResourceParameterBinding());
            }
            case "resourceAssignmentExpression" -> readElementSequenceItem(RESOURCE_ASSIGNMENT_EXPRESSION_READER, reader,
                    localName, element::setResourceAssignmentExpression);
        }
    }

}
