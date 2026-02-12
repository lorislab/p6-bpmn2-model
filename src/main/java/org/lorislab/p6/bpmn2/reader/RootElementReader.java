package org.lorislab.p6.bpmn2.reader;

import java.util.function.Supplier;

import org.lorislab.p6.bpmn2.model.ExtensionElements;
import org.lorislab.p6.bpmn2.model.RootElement;

public abstract class RootElementReader<T extends RootElement<? extends ExtensionElements>> extends BaseElementReader<T> {

    public RootElementReader(Supplier<T> supplier) {
        super(supplier);
    }

}
