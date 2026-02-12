package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.*;

public class Readers {

    protected static final DefinitionsReader DEFINITIONS_READER = new DefinitionsReader();

    protected static final ImportReader IMPORT_READER = new ImportReader();

    protected static final ExtensionReader EXTENSION_READER = new ExtensionReader();

    protected static final RelationshipReader RELATIONSHIP_READER = new RelationshipReader();

    protected static final BPMNDiagramReader BPMN_DIAGRAM_READER = new BPMNDiagramReader();

    protected static final ProcessReader PROCESS_READER = new ProcessReader();

    protected static final DocumentationReader DOCUMENTATION_READER = new DocumentationReader();

    protected static final ExtensionElementsReader EXTENSION_ELEMENTS_READER = new ExtensionElementsReader();

    protected static final ProcessExtensionElementsReader PROCESS_EXTENSION_ELEMENTS_READER = new ProcessExtensionElementsReader();

    protected static final ServiceTaskExtensionElementsReader SERVICE_TASK_EXTENSION_ELEMENTS_READER = new ServiceTaskExtensionElementsReader();

    protected static final InputOutputSpecificationReader INPUT_OUTPUT_SPECIFICATION_READER = new InputOutputSpecificationReader();

    protected static final InputOutputBindingReader INPUT_OUTPUT_BINDING_READER = new InputOutputBindingReader();

    protected static final DataStateReader DATA_STATE_READER = new DataStateReader();

    protected static final DataInputReader DATA_INPUT_READER = new DataInputReader();

    protected static final DataOutputReader DATA_OUTPUT_READER = new DataOutputReader();

    protected static final InputSetReader INPUT_SET_READER = new InputSetReader();

    protected static final OutputSetReader OUTPUT_SET_READER = new OutputSetReader();

    protected static final BaseElementReader<Auditing> AUDITING_READER = new BaseElementReader<>(Auditing::new);

    protected static final BaseElementReader<Monitoring> MONITORING_READER = new BaseElementReader<>(Monitoring::new);

    protected static final PropertyReader PROPERTY_READER = new PropertyReader();

    protected static final LaneSetReader LANE_SET_READER = new LaneSetReader();

    protected static final LaneReader LANE_READER = new LaneReader();

    protected static final BaseElementReader<PartitionElement> PARTITION_ELEMENT_READER = new BaseElementReader<>(
            PartitionElement::new);

    protected static final AssignmentReader ASSIGNMENT_READER = new AssignmentReader();

    protected static final FormalExpressionReader FORMAL_EXPRESSION_READER = new FormalExpressionReader();

    protected static final ExpressionReader EXPRESSION_READER = new ExpressionReader();

    protected static final DataAssociationReader<DataInputAssociation> DATA_INPUT_ASSOCIATION_READER = new DataAssociationReader<>(
            DataInputAssociation::new);

    protected static final DataAssociationReader<DataOutputAssociation> DATA_OUTPUT_ASSOCIATION_READER = new DataAssociationReader<>(
            DataOutputAssociation::new);

    protected static final LinkEventDefinitionReader LINK_EVENT_DEFINITION_READER = new LinkEventDefinitionReader();

    protected static final CorrelationSubscriptionReader CORRELATION_SUBSCRIPTION_READER = new CorrelationSubscriptionReader();

    protected static final CorrelationPropertyBindingReader CORRELATION_PROPERTY_BINDING_READER = new CorrelationPropertyBindingReader();

    protected static final ResourceParameterBindingReader RESOURCE_PARAMETER_BINDING_READER = new ResourceParameterBindingReader();

    protected static final GroupReader GROUP_READER = new GroupReader();

    protected static final AssociationReader ASSOCIATION_READER = new AssociationReader();

    protected static final TextReader TEXT_READER = new TextReader();

    protected static final TextAnnotationReader TEXT_ANNOTATION_READER = new TextAnnotationReader();

    protected static final CategoryReader CATEGORY_READER = new CategoryReader();

    protected static final CategoryValueReader CATEGORY_VALUE_READER = new CategoryValueReader();

    protected static final ParticipantMultiplicityReader PARTICIPANT_MULTIPLICITY_READER = new ParticipantMultiplicityReader();

    protected static final ParticipantReader PARTICIPANT_READER = new ParticipantReader();

    protected static final MessageFlowReader MESSAGE_FLOW_READER = new MessageFlowReader();

    protected static final CorrelationKeyReader CORRELATION_KEY_READER = new CorrelationKeyReader();

    protected static final SubConversationReader SUB_CONVERSATION_READER = new SubConversationReader();

    protected static final ParticipantAssociationReader PARTICIPANT_ASSOCIATION_READER = new ParticipantAssociationReader();

    protected static final CallConversationReader CALL_CONVERSATION_READER = new CallConversationReader();

    protected static final ConversationNodeReader<Conversation> CONVERSATION_READER = new ConversationNodeReader<>(
            Conversation::new);

    protected static final ConversationAssociationReader CONVERSATION_ASSOCIATION_READER = new ConversationAssociationReader();

    protected static final MessageFlowAssociationReader MESSAGE_FLOW_ASSOCIATION_READER = new MessageFlowAssociationReader();

    protected static final ConversationLinkReader CONVERSATION_LINK_READER = new ConversationLinkReader();

    protected static final CollaborationReader COLLABORATION_READER = new CollaborationReader();

    protected static final SignalReader SIGNAL_READER = new SignalReader();

    protected static final MessageReader MESSAGE_READER = new MessageReader();

    protected static final ResourceParameterReader RESOURCE_PARAMETER_READER = new ResourceParameterReader();

    protected static final ResourceReader RESOURCE_READER = new ResourceReader();

    protected static final DataStoreReader DATA_STORE_READER = new DataStoreReader();

    protected static final PartnerRoleReader PARTNER_ROLE_READER = new PartnerRoleReader();

    protected static final CorrelationPropertyRetrievalExpressionReader CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_READER = new CorrelationPropertyRetrievalExpressionReader();

    protected static final CorrelationPropertyReader CORRELATION_PROPERTY_READER = new CorrelationPropertyReader();

    protected static final RootElementReader<EndPoint> END_POINT_READER = new RootElementReader<>(EndPoint::new) {
    };

    protected static final ErrorReader ERROR_READER = new ErrorReader();

    protected static final AbstractGlobalTaskReader<GlobalTask> GLOBAL_TASK_READER = new AbstractGlobalTaskReader<>(
            GlobalTask::new);

    protected static final GlobalBusinessRuleTaskReader GLOBAL_BUSINESS_RULE_TASK_READER = new GlobalBusinessRuleTaskReader();

    protected static final OperationReader OPERATION_READER = new OperationReader();

    protected static final InterfaceReader INTERFACE_READER = new InterfaceReader();

    protected static final PartnerEntityReader PARTNER_ENTITY_READER = new PartnerEntityReader();

    protected static final ItemDefinitionReader ITEM_DEFINITION_READER = new ItemDefinitionReader();

    protected static final BaseElementReader<Rendering> RENDERING_READER = new BaseElementReader<>(Rendering::new);

    protected static final GlobalUserTaskReader GLOBAL_USER_TASK_READER = new GlobalUserTaskReader();

    protected static final ScriptReader SCRIPT_READER = new ScriptReader();

    protected static final GlobalScriptTaskReader GLOBAL_SCRIPT_TASK_READER = new GlobalScriptTaskReader();

    protected static final AbstractGlobalTaskReader<GlobalManualTask> GLOBAL_MANUAL_TASK_READER = new AbstractGlobalTaskReader<>(
            GlobalManualTask::new);

    protected static final MessageEventDefinitionReader MESSAGE_EVENT_DEFINITION_READER = new MessageEventDefinitionReader();

    protected static final SignalEventDefinitionReader SIGNAL_EVENT_DEFINITION_READER = new SignalEventDefinitionReader();

    protected static final ThrowEventReader<EndEvent> END_EVENT_READER = new ThrowEventReader<>(EndEvent::new);

    protected static final StartEventReader START_EVENT_READER = new StartEventReader();

    protected static final SequenceFlowReader SEQUENCE_FLOW_READER = new SequenceFlowReader();

    protected static final EventDefinitionReader<TerminateEventDefinition> TERMINATE_EVENT_DEFINITION_READER = new EventDefinitionReader<>(
            TerminateEventDefinition::new);

    protected static final EventDefinitionReader<CancelEventDefinition> CANCEL_EVENT_DEFINITION_READER = new EventDefinitionReader<>(
            CancelEventDefinition::new);

    protected static final ErrorEventDefinitionReader ERROR_EVENT_DEFINITION_READER = new ErrorEventDefinitionReader();

    protected static final EscalationEventDefinitionReader ESCALATION_EVENT_DEFINITION_READER = new EscalationEventDefinitionReader();

    protected static final ConditionalEventDefinitionReader CONDITIONAL_EVENT_DEFINITION_READER = new ConditionalEventDefinitionReader();

    protected static final TimerEventDefinitionReader TIMER_EVENT_DEFINITION_READER = new TimerEventDefinitionReader();

    protected static final CompensateEventDefinitionReader COMPENSATE_EVENT_DEFINITION_READER = new CompensateEventDefinitionReader();

    protected static final CallActivityReader CALL_ACTIVITY_READER = new CallActivityReader();

    protected static final ExclusiveGatewayReader EXCLUSIVE_GATEWAY_READER = new ExclusiveGatewayReader();

    protected static final InclusiveGatewayReader INCLUSIVE_GATEWAY_READER = new InclusiveGatewayReader();

    protected static final GatewayReader<ParallelGateway> PARALLEL_GATEWAY_READER = new GatewayReader<>(ParallelGateway::new);

    protected static final ComplexGatewayReader COMPLEX_GATEWAY_READER = new ComplexGatewayReader();

    protected static final EventBasedGatewayReader EVENT_BASED_GATEWAY_READER = new EventBasedGatewayReader();

    protected static final ServiceTaskReader SERVICE_TASK_READER = new ServiceTaskReader();

    protected static final ActivityReader<Task<?>> TASK_READER = new ActivityReader<>(Task::new);

    protected static final ActivityReader<ManualTask> MANUAL_TASK_READER = new ActivityReader<>(ManualTask::new);

    protected static final BusinessRuleTaskReader BUSINESS_RULE_TASK_READER = new BusinessRuleTaskReader();

    protected static final ReceiveTaskReader RECEIVE_TASK_READER = new ReceiveTaskReader();

    protected static final ScriptTaskReader SCRIPT_TASK_READER = new ScriptTaskReader();

    protected static final SendTaskReader SEND_TASK_READER = new SendTaskReader();

    protected static final ChoreographyTaskReader CHOREOGRAPHY_TASK_READER = new ChoreographyTaskReader();

    protected static final CallChoreographyReader CALL_CHOREOGRAPHY_READER = new CallChoreographyReader();

    protected static final DataStoreReferenceReader DATA_STORE_REFERENCE_READER = new DataStoreReferenceReader();

    protected static final ThrowEventReader<IntermediateThrowEvent> INTERMEDIATE_THROW_EVENT_READER = new ThrowEventReader<>(
            IntermediateThrowEvent::new);

    protected static final BoundaryEventReader BOUNDARY_EVENT_READER = new BoundaryEventReader();

    protected static final ThrowEventReader<ImplicitThrowEvent> IMPLICIT_THROW_EVENT_READER = new ThrowEventReader<>(
            ImplicitThrowEvent::new);

    protected static final CatchEventReader<IntermediateCatchEvent> INTERMEDIATE_CATCH_EVENT_READER = new CatchEventReader<>(
            IntermediateCatchEvent::new);

    protected static final EventReader<Event> EVENT_READER = new EventReader<>(Event::new);

    protected static final DataObjectReader DATA_OBJECT_READER = new DataObjectReader();

    protected static final DataObjectReferenceReader DATA_OBJECT_REFERENCE_READER = new DataObjectReferenceReader();

    protected static final SubChoreographyReader SUB_CHOREOGRAPHY_READER = new SubChoreographyReader();

    protected static final SubProcessReader<SubProcess> SUB_PROCESS_READER = new SubProcessReader<>(SubProcess::new);

    protected static final AdHocSubProcessReader AD_HOC_SUB_PROCESS_READER = new AdHocSubProcessReader();

    protected static final UserTaskReader USER_TASK_READER = new UserTaskReader();

    protected static final TransactionReader TRANSACTION_READER = new TransactionReader();

    protected static final EscalationReader ESCALATION_READER = new EscalationReader();

    protected static final StandardLoopCharacteristicsReader STANDARD_LOOP_CHARACTERISTICS_READER = new StandardLoopCharacteristicsReader();

    protected static final ComplexBehaviorDefinitionReader COMPLEX_BEHAVIOR_DEFINITION_READER = new ComplexBehaviorDefinitionReader();

    protected static final MultiInstanceLoopCharacteristicsReader MULTI_INSTANCE_LOOP_CHARACTERISTICS_READER = new MultiInstanceLoopCharacteristicsReader();

    protected static final ResourceRoleReader<ResourceRole> RESOURCE_ROLE_READER = new ResourceRoleReader<>(ResourceRole::new);

    protected static final ResourceRoleReader<Performer> PERFORMER_READER = new ResourceRoleReader<>(Performer::new);

    protected static final ResourceRoleReader<HumanPerformer> HUMAN_PERFORMER_READER = new ResourceRoleReader<>(
            HumanPerformer::new);

    protected static final ResourceRoleReader<PotentialOwner> POTENTIAL_OWNER_READER = new ResourceRoleReader<>(
            PotentialOwner::new);

    protected static final ResourceAssignmentExpressionReader RESOURCE_ASSIGNMENT_EXPRESSION_READER = new ResourceAssignmentExpressionReader();

    protected static final ZeebeVersionTagReader ZEEBE_VERSION_TAG_READER = new ZeebeVersionTagReader();

    protected static final ZeebeServiceTaskTaskDefinitionReader ZEEBE_SERVICE_TASK_TASK_DEFINITION_READER = new ZeebeServiceTaskTaskDefinitionReader();

    protected static final ZeebeServiceTaskTaskHeadersReader ZEEBE_SERVICE_TASK_TASK_HEADERS_READER = new ZeebeServiceTaskTaskHeadersReader();

    protected static final ZeebeServiceTaskTaskHeaderReader ZEEBE_SERVICE_TASK_TASK_HEADER_READER = new ZeebeServiceTaskTaskHeaderReader();

    protected static final ZeebeServiceTaskIOMappingReader ZEEBE_SERVICE_TASK_IO_MAPPING_READER = new ZeebeServiceTaskIOMappingReader();

    protected static final ZeebeServiceTaskIOMappingInputReader ZEEBE_SERVICE_TASK_IO_MAPPING_INPUT_READER = new ZeebeServiceTaskIOMappingInputReader();

    protected static final ZeebeServiceTaskIOMappingOutputReader ZEEBE_SERVICE_TASK_IO_MAPPING_OUTPUT_READER = new ZeebeServiceTaskIOMappingOutputReader();

    protected static final ZeebeServiceTaskPropertiesReader ZEEBE_SERVICE_TASK_PROPERTIES_READER = new ZeebeServiceTaskPropertiesReader();

    protected static final ZeebeServiceTaskPropertyReader ZEEBE_SERVICE_TASK_PROPERTY_READER = new ZeebeServiceTaskPropertyReader();

    protected static final ZeebeServiceTaskExecutionListenersReader ZEEBE_SERVICE_TASK_EXECUTION_LISTENERS_READER = new ZeebeServiceTaskExecutionListenersReader();

    protected static final ZeebeServiceTaskExecutionListenerReader ZEEBE_SERVICE_TASK_EXECUTION_LISTENER_READER = new ZeebeServiceTaskExecutionListenerReader();

}
