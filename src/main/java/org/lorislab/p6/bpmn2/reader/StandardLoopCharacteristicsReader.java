package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_LOOP_MAXIMUM;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_TEST_BEFORE;
import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.StandardLoopCharacteristics;

public class StandardLoopCharacteristicsReader extends BaseElementReader<StandardLoopCharacteristics> {

    public StandardLoopCharacteristicsReader() {
        super(StandardLoopCharacteristics::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, StandardLoopCharacteristics element) throws Exception {
        super.readAttrs(attrs, element);
        // testBefore
        element.setTestBefore(attrs.getBoolean(ATTR_TEST_BEFORE, false));
        // loopMaximum
        element.setLoopMaximum(attrs.getInteger(ATTR_LOOP_MAXIMUM));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, StandardLoopCharacteristics element) throws Exception {
        super.readElement(reader, name, element);
        // loopCondition
        readElementSequenceItem(EXPRESSION_READER, reader, "loopCondition", element::setLoopCondition);
    }
}
