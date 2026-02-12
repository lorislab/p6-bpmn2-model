package org.lorislab.p6.bpmn2.model;

public abstract class RootElement<T extends ExtensionElements> extends BaseElement<T> {

    private final RootElementClass rootElementClass;

    public RootElement(RootElementClass rootElementClass) {
        this.rootElementClass = rootElementClass;
    }

    public RootElementClass getRootElementClass() {
        return rootElementClass;
    }

    public enum RootElementClass {

        EVENT_DEFINITION,

        MESSAGE,

        CATEGORY,

        COLLABORATION,

        PARTNER_ROLE,

        ESCALATION,

        PARTNER_ENTITY,

        END_POINT,

        RESOURCE,

        ITEM_DEFINITION,

        INTERFACE,

        ERROR,

        CALLABLE_ELEMENT,

        DATA_STORE,

        CORRELATION_PROPERTY,

        SIGNAL;
    }
}
