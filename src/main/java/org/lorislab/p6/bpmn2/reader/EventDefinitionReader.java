package org.lorislab.p6.bpmn2.reader;

import java.util.function.Supplier;

import org.lorislab.p6.bpmn2.model.EventDefinition;

public class EventDefinitionReader<T extends EventDefinition> extends RootElementReader<T> {

    public EventDefinitionReader(Supplier<T> supplier) {
        super(supplier);
    }

}
