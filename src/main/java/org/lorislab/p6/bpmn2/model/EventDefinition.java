package org.lorislab.p6.bpmn2.model;

public abstract class EventDefinition extends RootElement<ExtensionElements> {

    private final EventDefinitionClass eventDefinitionClass;

    public EventDefinition(EventDefinitionClass eventDefinitionClass) {
        super(RootElementClass.EVENT_DEFINITION);
        this.eventDefinitionClass = eventDefinitionClass;
    }

    public EventDefinitionClass getEventDefinitionClass() {
        return eventDefinitionClass;
    }

    public enum EventDefinitionClass {

        CONDITIONAL_EVENT_DEFINITION,

        LINK_EVENT_DEFINITION,

        ERROR_EVENT_DEFINITION,

        SIGNAL_EVENT_DEFINITION,

        TERMINATE_EVENT_DEFINITION,

        MESSAGE_EVENT_DEFINITION,

        ESCALATION_EVENT_DEFINITION,

        COMPENSATE_EVENT_DEFINITION,

        TIMER_EVENT_DEFINITION,

        CANCEL_EVENT_DEFINITION;
    }
}
