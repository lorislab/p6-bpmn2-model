package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;
import static org.lorislab.p6.bpmn2.reader.Readers.CATEGORY_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.COLLABORATION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.CORRELATION_PROPERTY_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.DATA_STORE_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.END_POINT_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.ERROR_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.GLOBAL_BUSINESS_RULE_TASK_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.GLOBAL_MANUAL_TASK_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.GLOBAL_SCRIPT_TASK_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.GLOBAL_TASK_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.GLOBAL_USER_TASK_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.INTERFACE_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.ITEM_DEFINITION_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.PARTNER_ENTITY_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.PARTNER_ROLE_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.RESOURCE_READER;

import java.util.List;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.*;

public class ReaderItems {

    public static void readFlowElements(XMLStreamReader2 reader, List<FlowElement<?>> item) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "startEvent" -> START_EVENT_READER.read(reader, name, item::add);
                case "endEvent" -> END_EVENT_READER.read(reader, name, item::add);
                case "sequenceFlow" -> SEQUENCE_FLOW_READER.read(reader, name, item::add);
                case "callActivity" -> CALL_ACTIVITY_READER.read(reader, name, item::add);
                case "exclusiveGateway" -> EXCLUSIVE_GATEWAY_READER.read(reader, name, item::add);
                case "inclusiveGateway" -> INCLUSIVE_GATEWAY_READER.read(reader, name, item::add);
                case "parallelGateway" -> PARALLEL_GATEWAY_READER.read(reader, name, item::add);
                case "complexGateway" -> COMPLEX_GATEWAY_READER.read(reader, name, item::add);
                case "eventBasedGateway" -> EVENT_BASED_GATEWAY_READER.read(reader, name, item::add);
                case "serviceTask" -> SERVICE_TASK_READER.read(reader, name, item::add);
                case "businessRuleTask" -> BUSINESS_RULE_TASK_READER.read(reader, name, item::add);
                case "manualTask" -> MANUAL_TASK_READER.read(reader, name, item::add);
                case "receiveTask" -> RECEIVE_TASK_READER.read(reader, name, item::add);
                case "scriptTask" -> SCRIPT_TASK_READER.read(reader, name, item::add);
                case "sendTask" -> SEND_TASK_READER.read(reader, name, item::add);
                case "choreographyTask" -> CHOREOGRAPHY_TASK_READER.read(reader, name, item::add);
                case "task" -> TASK_READER.read(reader, name, item::add);
                case "callChoreography" -> CALL_CHOREOGRAPHY_READER.read(reader, name, item::add);
                case "dataStoreReference" -> DATA_STORE_REFERENCE_READER.read(reader, name, item::add);
                case "intermediateThrowEvent" -> INTERMEDIATE_THROW_EVENT_READER.read(reader, name, item::add);
                case "boundaryEvent" -> BOUNDARY_EVENT_READER.read(reader, name, item::add);
                case "implicitThrowEvent" -> IMPLICIT_THROW_EVENT_READER.read(reader, name, item::add);
                case "intermediateCatchEvent" -> INTERMEDIATE_CATCH_EVENT_READER.read(reader, name, item::add);
                case "event" -> EVENT_READER.read(reader, name, item::add);
                case "dataObject" -> DATA_OBJECT_READER.read(reader, name, item::add);
                case "dataObjectReference" -> DATA_OBJECT_REFERENCE_READER.read(reader, name, item::add);
                case "subChoreography" -> SUB_CHOREOGRAPHY_READER.read(reader, name, item::add);
                case "adHocSubProcess" -> AD_HOC_SUB_PROCESS_READER.read(reader, name, item::add);
                case "subProcess" -> SUB_PROCESS_READER.read(reader, name, item::add);
                case "userTask" -> USER_TASK_READER.read(reader, name, item::add);
                case "transaction" -> TRANSACTION_READER.read(reader, name, item::add);
                default -> false;
            };

            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

    public static void readRootElements(XMLStreamReader2 reader, RootElementItems item) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "process" -> PROCESS_READER.read(reader, name, item.getProcess()::add);
                case "signal" -> SIGNAL_READER.read(reader, name, item.getSignal()::add);
                case "message" -> MESSAGE_READER.read(reader, name, item.getMessage()::add);
                case "resource" -> RESOURCE_READER.read(reader, name, item.getResource()::add);
                case "category" -> CATEGORY_READER.read(reader, name, item.getCategory()::add);
                case "callConversation" -> CALL_CONVERSATION_READER.read(reader, name, item.getCallConversation()::add);
                case "correlationProperty" ->
                    CORRELATION_PROPERTY_READER.read(reader, name, item.getCorrelationProperty()::add);
                case "dataStore" -> DATA_STORE_READER.read(reader, name, item.getDataStore()::add);
                case "endPoint" -> END_POINT_READER.read(reader, name, item.getEndPoint()::add);
                case "error" -> ERROR_READER.read(reader, name, item.getError()::add); //->event
                case "globalBusinessRuleTask" ->
                    GLOBAL_BUSINESS_RULE_TASK_READER.read(reader, name, item.getGlobalBusinessRuleTask()::add);
                case "globalManualTask" -> GLOBAL_MANUAL_TASK_READER.read(reader, name, item.getGlobalManualTask()::add);
                case "globalScriptTask" -> GLOBAL_SCRIPT_TASK_READER.read(reader, name, item.getGlobalScriptTask()::add);
                case "globalTask" -> GLOBAL_TASK_READER.read(reader, name, item.getGlobalTask()::add);
                case "globalUserTask" -> GLOBAL_USER_TASK_READER.read(reader, name, item.getGlobalUserTask()::add);
                case "interface" -> INTERFACE_READER.read(reader, name, item.getInterface()::add);
                case "itemDefinition" -> ITEM_DEFINITION_READER.read(reader, name, item.getItemDefinition()::add);
                case "partnerEntity" -> PARTNER_ENTITY_READER.read(reader, name, item.getPartnerEntity()::add);
                case "partnerRole" -> PARTNER_ROLE_READER.read(reader, name, item.getPartnerRole()::add);
                case "escalation" -> ESCALATION_READER.read(reader, name, item.getEscalation()::add);
                case "collaboration" -> COLLABORATION_READER.read(reader, name, item.getCollaboration()::add);
                default -> false;
            };
            // eventDefinition
            if (!next) {
                next = readEventDefinitions(reader, item.getEventDefinition());
            }
            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

    public static boolean readEventDefinitions(XMLStreamReader2 reader, EventDefinitionList item) throws Exception {
        var result = false;

        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "linkEventDefinition" ->
                    LINK_EVENT_DEFINITION_READER.read(reader, name, item.getLinkEventDefinition()::add);
                case "messageEventDefinition" ->
                    MESSAGE_EVENT_DEFINITION_READER.read(reader, name, item.getMessageEventDefinition()::add);
                case "signalEventDefinition" ->
                    SIGNAL_EVENT_DEFINITION_READER.read(reader, name, item.getSignalEventDefinition()::add);
                case "terminateEventDefinition" ->
                    TERMINATE_EVENT_DEFINITION_READER.read(reader, name, item.getTerminateEventDefinition()::add);
                case "timerEventDefinition" ->
                    TIMER_EVENT_DEFINITION_READER.read(reader, name, item.getTimerEventDefinition()::add);
                case "cancelEventDefinition" ->
                    CANCEL_EVENT_DEFINITION_READER.read(reader, name, item.getCancelEventDefinition()::add);
                case "compensateEventDefinition" ->
                    COMPENSATE_EVENT_DEFINITION_READER.read(reader, name, item.getCompensateEventDefinition()::add);
                case "conditionalEventDefinition" ->
                    CONDITIONAL_EVENT_DEFINITION_READER.read(reader, name, item.getConditionalEventDefinition()::add);
                case "errorEventDefinition" ->
                    ERROR_EVENT_DEFINITION_READER.read(reader, name, item.getErrorEventDefinition()::add);
                case "escalationEventDefinition" ->
                    ESCALATION_EVENT_DEFINITION_READER.read(reader, name, item.getEscalationEventDefinition()::add);
                default -> false;
            };
            result = result || next;
            if (next) {
                reader.nextTag();
            }
        } while (next);

        return result;
    }

    public static void readConversationNodes(XMLStreamReader2 reader, List<ConversationNode> item) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "subConversation" -> SUB_CONVERSATION_READER.read(reader, name, item::add);
                case "callConversation" -> CALL_CONVERSATION_READER.read(reader, name, item::add);
                case "conversation" -> CONVERSATION_READER.read(reader, name, item::add);
                default -> false;
            };
            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

    public static void readArtifacts(XMLStreamReader2 reader, List<Artifact> artifact) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "textAnnotation" -> TEXT_ANNOTATION_READER.read(reader, name, artifact::add);
                case "association" -> ASSOCIATION_READER.read(reader, name, artifact::add);
                case "group" -> GROUP_READER.read(reader, name, artifact::add);
                default -> false;
            };
            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

    public static void readLoopCharacteristics(XMLStreamReader2 reader, List<LoopCharacteristics> items) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "multiInstanceLoopCharacteristics" ->
                    MULTI_INSTANCE_LOOP_CHARACTERISTICS_READER.read(reader, name, items::add);
                case "standardLoopCharacteristics" -> STANDARD_LOOP_CHARACTERISTICS_READER.read(reader, name, items::add);
                default -> false;
            };
            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

    public static void readResourceRole(XMLStreamReader2 reader, List<ResourceRole> items) throws Exception {
        var next = false;
        do {
            var name = reader.getLocalName();
            next = switch (name) {
                case "resourceRole" -> RESOURCE_ROLE_READER.read(reader, name, items::add);
                case "performer" -> PERFORMER_READER.read(reader, name, items::add);
                case "humanPerformer" -> HUMAN_PERFORMER_READER.read(reader, name, items::add);
                case "potentialOwner" -> POTENTIAL_OWNER_READER.read(reader, name, items::add);
                default -> false;
            };
            if (next) {
                reader.nextTag();
            }
        } while (next);
    }

}
