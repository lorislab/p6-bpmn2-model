package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Assignment;

public class AssignmentReader extends BaseElementReader<Assignment> {

    public AssignmentReader() {
        super(Assignment::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Assignment element) throws Exception {
        super.readElement(reader, name, element);
        // from
        readElementSequenceItem(EXPRESSION_READER, reader, "from", element::setFrom, true);
        // to
        readElementSequenceItem(EXPRESSION_READER, reader, "to", element::setTo, true);

    }

}
