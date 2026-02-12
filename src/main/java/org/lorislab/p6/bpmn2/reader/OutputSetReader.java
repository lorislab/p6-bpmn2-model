package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.OutputSet;

public class OutputSetReader extends BaseElementReader<OutputSet> {

    public OutputSetReader() {
        super(OutputSet::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, OutputSet element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, OutputSet element) throws Exception {
        super.readElement(reader, name, element);
        // dataOutputRefs
        readTextElementList(reader, "dataOutputRefs", element.getDataOutputRefs());
        // optionalOutputRefs
        readTextElementList(reader, "optionalOutputRefs", element.getOptionalOutputRefs());
        // whileExecutingOutputRefs
        readTextElementList(reader, "whileExecutingOutputRefs", element.getWhileExecutingOutputRefs());
        // inputSetRefs
        readTextElementList(reader, "inputSetRefs", element.getInputSetRefs());
    }

}
