package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.*;
import static org.lorislab.p6.bpmn2.reader.Readers.*;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Activity;

public class ActivityReader<T extends Activity<?>> extends FlowNodeReader<T> {

    public ActivityReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // isForCompensation
        element.setForCompensation(attrs.getBoolean(ATTR_IS_FOR_COMPENSATION, false));
        // startQuantity
        element.setStartQuantity(attrs.getInteger(ATTR_START_QUANTITY, 1));
        // completionQuantity
        element.setCompletionQuantity(attrs.getInteger(ATTR_COMPLETION_QUANTITY, 1));
        // default
        element.setDefault(attrs.getString(ATTR_DEFAULT));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // ioSpecification
        readElementSequenceItem(INPUT_OUTPUT_SPECIFICATION_READER, reader, "ioSpecification", element::setIoSpecification);
        // property
        readElementSequence(PROPERTY_READER, reader, "property", element.getProperty());
        // dataInputAssociation
        readElementSequence(DATA_INPUT_ASSOCIATION_READER, reader, "dataInputAssociation", element.getDataInputAssociation());
        // dataOutputAssociation
        readElementSequence(DATA_OUTPUT_ASSOCIATION_READER, reader, "dataOutputAssociation",
                element.getDataOutputAssociation());
        // resourceRole
        ReaderItems.readResourceRole(reader, element.getResourceRole());
        // loopCharacteristics
        ReaderItems.readLoopCharacteristics(reader, element.getLoopCharacteristics());
    }
}
