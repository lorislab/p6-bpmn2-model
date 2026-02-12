package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.INPUT_OUTPUT_BINDING_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.INPUT_OUTPUT_SPECIFICATION_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.CallableElement;

public abstract class CallableElementReader<T extends CallableElement<?>> extends RootElementReader<T> {

    public CallableElementReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // supportedInterfaceRef
        readTextElementList(reader, "supportedInterfaceRef", element.getSupportedInterfaceRefs());
        // ioSpecification
        readElementSequenceItem(INPUT_OUTPUT_SPECIFICATION_READER, reader, "ioSpecification", element::setIoSpecification);
        // ioBinding
        readElementSequence(INPUT_OUTPUT_BINDING_READER, reader, "ioBinding", element.getInputOutputBindings());
    }
}
