package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.InputSet;

public class InputSetReader extends BaseElementReader<InputSet> {

    public InputSetReader() {
        super(InputSet::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, InputSet element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, InputSet element) throws Exception {
        super.readElement(reader, name, element);
        // dataInputRefs
        readTextElementList(reader, "dataInputRefs", element.getDataInputRefs());
        // optionalInputRefs
        readTextElementList(reader, "optionalInputRefs", element.getOptionalInputRefs());
        // whileExecutingInputRefs
        readTextElementList(reader, "whileExecutingInputRefs", element.getWhileExecutingInputRefs());
        // outputSetRefs
        readTextElementList(reader, "outputSetRefs", element.getOutputSetRefs());
    }

}
