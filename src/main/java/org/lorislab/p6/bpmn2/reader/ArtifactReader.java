package org.lorislab.p6.bpmn2.reader;

import java.util.function.Supplier;

import org.lorislab.p6.bpmn2.model.Artifact;

public abstract class ArtifactReader<T extends Artifact> extends BaseElementReader<T> {

    public ArtifactReader(Supplier<T> supplier) {
        super(supplier);
    }

}
