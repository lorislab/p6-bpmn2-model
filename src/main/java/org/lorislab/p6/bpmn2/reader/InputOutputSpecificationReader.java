package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.InputOutputSpecification;

public class InputOutputSpecificationReader extends BaseElementReader<InputOutputSpecification> {

    public InputOutputSpecificationReader() {
        super(InputOutputSpecification::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, InputOutputSpecification element) throws Exception {
        super.readElement(reader, name, element);
        // dataInput
        readElementSequence(DATA_INPUT_READER, reader, "dataInput", element.getDataInputs());
        // dataOutput
        readElementSequence(DATA_OUTPUT_READER, reader, "dataOutput", element.getDataOutputs());
        // inputSet
        readElementSequence(INPUT_SET_READER, reader, "inputSet", element.getInputSets(), 1);
        // outputSet
        readElementSequence(OUTPUT_SET_READER, reader, "outputSet", element.getOutputSets(), 1);
    }

}
