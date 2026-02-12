package org.lorislab.p6.bpmn2.model;

public abstract class LoopCharacteristics extends BaseElement<ExtensionElements> {

    private final LoopCharacteristicsClass loopCharacteristicsClass;

    protected LoopCharacteristics(LoopCharacteristicsClass loopCharacteristicsClass) {
        this.loopCharacteristicsClass = loopCharacteristicsClass;
    }

    public LoopCharacteristicsClass getLoopCharacteristicsClass() {
        return loopCharacteristicsClass;
    }

    public enum LoopCharacteristicsClass {
        STANDARD_LOOP_CHARACTERISTICS,
        MULTI_INSTANCE_LOOP_CHARACTERISTICS;
    }
}
