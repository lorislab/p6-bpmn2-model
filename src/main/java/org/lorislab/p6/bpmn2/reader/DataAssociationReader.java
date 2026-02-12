package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.ASSIGNMENT_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.DataAssociation;

public class DataAssociationReader<T extends DataAssociation> extends BaseElementReader<T> {

    public DataAssociationReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // sourceRef
        readTextElementList(reader, "sourceRef", element.getSourceRef());
        // targetRef
        readTextElement(reader, "targetRef", element::setTargetRef, true);
        // transformation
        readElementSequenceItem(FORMAL_EXPRESSION_READER, reader, "transformation", element::setTransformation);
        // assignment
        readElementSequence(ASSIGNMENT_READER, reader, "assignment", element.getAssignment());
    }

}
