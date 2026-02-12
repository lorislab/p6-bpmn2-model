package org.lorislab.p6.bpmn2.reader;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.codehaus.stax2.XMLStreamReader2;

public class AttributeReader {

    protected static final QName ATTR_ID = new QName(null, "id");
    protected static final QName ATTR_NAME = new QName(null, "name");
    protected static final QName ATTR_ITEM_SUBJECT_REF = new QName(null, "itemSubjectRef");
    protected static final QName ATTR_IS_CLOSED = new QName(null, "isClosed");
    protected static final QName ATTR_IS_COLLECTION = new QName(null, "isCollection");
    protected static final QName ATTR_SOURCE_REF = new QName("sourceRef");
    protected static final QName ATTR_TARGET_REF = new QName("targetRef");
    protected static final QName ATTR_STRUCTURE_REF = new QName("structureRef");
    protected static final QName ATTR_ITEM_REF = new QName("itemRef");
    protected static final QName ATTR_TYPE = new QName("type");
    protected static final QName ATTR_IS_REQUIRED = new QName("isRequired");
    protected static final QName ATTR_CAPACITY = new QName("capacity");
    protected static final QName ATTR_IS_UNLIMITED = new QName("isUnlimited");
    protected static final QName ATTR_MESSAGE_REF = new QName("messageRef");
    protected static final QName ATTR_ERROR_CODE = new QName("errorCode");
    protected static final QName ATTR_IMPLEMENTATION = new QName("implementation");
    protected static final QName ATTR_IMPLEMENTATION_REF = new QName("implementationRef");
    protected static final QName ATTR_ITEM_KIND = new QName("itemKind");
    protected static final QName ATTR_SCRIPT_LANGUAGE = new QName("scriptLanguage");
    protected static final QName ATTR_SIGNAL_REF = new QName("signalRef");
    protected static final QName ATTR_PARALLEL_MULTIPLE = new QName("parallelMultiple");
    protected static final QName ATTR_IS_INTERRUPTING = new QName("isInterrupting");
    protected static final QName ATTR_IS_IMMEDIATE = new QName("isImmediate");
    protected static final QName ATTR_ERROR_REF = new QName("errorRef");
    protected static final QName ATTR_ESCALATION_REF = new QName("escalationRef");
    protected static final QName ATTR_ACTIVITY_REF = new QName("activityRef");
    protected static final QName ATTR_WAIT_FOR_COMPLETION = new QName("waitForCompletion");
    protected static final QName ATTR_DEFAULT = new QName("default");
    protected static final QName ATTR_IS_FOR_COMPENSATION = new QName("isForCompensation");
    protected static final QName ATTR_START_QUANTITY = new QName("startQuantity");
    protected static final QName ATTR_COMPLETION_QUANTITY = new QName("completionQuantity");
    protected static final QName ATTR_CALLED_ELEMENT = new QName("calledElement");
    protected static final QName ATTR_GATEWAY_DIRECTION = new QName("gatewayDirection");
    protected static final QName ATTR_INSTANTIATE = new QName("instantiate");
    protected static final QName ATTR_EVENT_GATEWAY_TYPE = new QName("eventGatewayType");
    protected static final QName ATTR_OPERATION_REF = new QName("operationRef");
    protected static final QName ATTR_INPUT_DATA_REF = new QName("inputDataRef");
    protected static final QName ATTR_OUTPUT_DATA_REF = new QName("outputDataRef");
    protected static final QName ATTR_SCRIPT_FORMAT = new QName("scriptFormat");
    protected static final QName ATTR_INITIATING_PARTICIPANT_REF = new QName("initiatingParticipantRef");
    protected static final QName ATTR_LOOP_TYPE = new QName("loopType");
    protected static final QName ATTR_CALLED_CHOREOGRAPHY_REF = new QName("calledChoreographyRef");
    protected static final QName ATTR_DATA_STORE_REF = new QName("dataStoreRef");
    protected static final QName ATTR_ATTACHED_TO_REF = new QName("attachedToRef");
    protected static final QName ATTR_CANCEL_ACTIVITY = new QName("cancelActivity");
    protected static final QName ATTR_DATA_OBJECT_REF = new QName("dataObjectRef");
    protected static final QName ATTR_TRIGGERED_BY_EVENT = new QName("triggeredByEvent");
    protected static final QName ATTR_ORDERING = new QName("ordering");
    protected static final QName ATTR_CANCEL_REMAINING_INSTANCES = new QName("cancelRemainingInstances");
    protected static final QName ATTR_METHOD = new QName("method");
    protected static final QName ATTR_ESCALATION_CODE = new QName("escalationCode");
    protected static final QName ATTR_LOOP_MAXIMUM = new QName("loopMaximum");
    protected static final QName ATTR_TEST_BEFORE = new QName("testBefore");
    protected static final QName ATTR_IS_SEQUENTIAL = new QName("isSequential");
    protected static final QName ATTR_BEHAVIOR = new QName("behavior");
    protected static final QName ATTR_ONE_BEHAVIOR_EVENT_REF = new QName("oneBehaviorEventRef");
    protected static final QName ATTR_NONE_BEHAVIOR_EVENT_REF = new QName("noneBehaviorEventRef");
    protected static final QName ATTR_DEFINITION = new QName("definition");
    protected static final QName ATTR_MUST_UNDERSTAND = new QName("mustUnderstand");
    protected static final QName ATTR_LANGUAGE = new QName("language");
    protected static final QName ATTR_EVALUATES_TO_TYPE_REF = new QName("evaluatesToTypeRef");

    private final XMLStreamReader2 reader;

    private final Map<QName, Integer> attrs;

    public AttributeReader(XMLStreamReader2 reader) {
        this.reader = reader;
        this.attrs = new HashMap<>();
        for (int i = 0, count = reader.getAttributeCount(); i < count; i++) {
            attrs.put(reader.getAttributeName(i), i);
        }
    }

    public void readOther(Map<QName, String> fn) {
        attrs.forEach((k, i) -> {
            if (k.getNamespaceURI() != null && !k.getNamespaceURI().isBlank()) {
                fn.put(k, reader.getAttributeValue(i));
            }
        });
    }

    public String getString(QName attr) {
        return getString(attr, false);
    }

    public String getString(QName attr, String defaultValue) {
        var s = getString(attr, false);
        if (s == null) {
            return defaultValue;
        }
        return s;
    }

    public String getString(QName attr, boolean required) {
        var i = attrs.get(attr);
        if (i == null) {
            return null;
        }
        var s = reader.getAttributeValue(i);
        if (required && s == null) {
            throw new RuntimeException("Required attribute " + attr);
        }
        return s;
    }

    public int getInteger(QName attr, int defaultValue) {
        var i = attrs.get(attr);
        if (i == null) {
            return defaultValue;
        }
        try {
            return reader.getAttributeAsInt(i);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer getInteger(QName attr) {
        var i = attrs.get(attr);
        if (i == null) {
            return null;
        }
        try {
            return reader.getAttributeAsInt(i);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    public Long getLong(QName attr) {
        var i = attrs.get(attr);
        if (i == null) {
            return null;
        }
        try {
            return reader.getAttributeAsLong(i);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean getBoolean(QName attr) {
        var i = attrs.get(attr);
        if (i == null) {
            return null;
        }
        try {
            return reader.getAttributeAsBoolean(i);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getBoolean(QName attr, boolean defaultValue) {
        var i = attrs.get(attr);
        if (i == null) {
            return defaultValue;
        }
        try {
            return reader.getAttributeAsBoolean(i);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    public <E extends Enum<E>> E getEnum(QName attr, Class<E> clazz, E defaultValue) {
        var s = getString(attr, false);
        if (s == null) {
            return defaultValue;
        }
        return Enum.valueOf(clazz, s);
    }

}
