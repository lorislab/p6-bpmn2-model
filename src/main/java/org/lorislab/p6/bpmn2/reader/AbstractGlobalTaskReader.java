package org.lorislab.p6.bpmn2.reader;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.GlobalTask;

public class AbstractGlobalTaskReader<T extends GlobalTask> extends CallableElementReader<T> {

    public AbstractGlobalTaskReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // resourceRole
        ReaderItems.readResourceRole(reader, element.getResourceRole());
    }

}
