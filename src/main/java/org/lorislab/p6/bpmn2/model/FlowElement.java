package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class FlowElement<T extends ExtensionElements> extends BaseElement<T> {

    private final FlowElementClass flowElementClass;

    private String name;

    private Auditing auditing;

    private Monitoring monitoring;

    private final List<String> categoryValueRefs = new ArrayList<>();

    protected FlowElement(FlowElementClass flowElementClass) {
        this.flowElementClass = flowElementClass;
    }

    public FlowElementClass getFlowElementClass() {
        return flowElementClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auditing getAuditing() {
        return auditing;
    }

    public void setAuditing(Auditing auditing) {
        this.auditing = auditing;
    }

    public Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public List<String> getCategoryValueRefs() {
        return categoryValueRefs;
    }

    public enum FlowElementClass {

        START_EVENT,
        END_EVENT,
        SEQUENCE_FLOW,
        CALL_ACTIVITY,
        EXCLUSIVE_GATEWAY,
        INCLUSIVE_GATEWAY,
        PARALLEL_GATEWAY,
        COMPLEX_GATEWAY,
        EVENT_BASED_GATEWAY,
        SERVICE_TASK,
        BUSINESS_RULE_TASK,
        MANUAL_TASK,
        RECEIVE_TASK,
        SCRIPT_TASK,
        SEND_TASK,
        CHOREOGRAPHY_TASK,
        TASK,
        CALL_CHOREOGRAPHY,
        DATA_STORE_REFERENCE,
        INTERMEDIATE_THROW_EVENT,
        BOUNDARY_EVENT,
        IMPLICIT_THROW_EVENT,
        INTERMEDIATE_CATCH_EVENT,
        EVENT,
        DATA_OBJECT,
        DATA_OBJECT_REFERENCE,
        SUB_CHOREOGRAPHY,
        AD_HOC_SUB_PROCESS,
        SUB_PROCESS,
        USER_TASK,
        TRANSACTION;

    }

    public static <E extends FlowElement<?>> E unwrap(FlowElement<?> element, Class<E> type) {
        if (type.isInstance(element)) {
            return type.cast(element);
        }
        throw new RuntimeException("Element cannot unwrap '" + element.getClass().getName() + "' as '" + type.getName() + "'");
    }
}
