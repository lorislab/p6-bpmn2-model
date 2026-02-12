package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class RootElementItems {

    private final List<Category> category = new ArrayList<>();

    private final List<Collaboration> collaboration = new ArrayList<>();

    private final List<CorrelationProperty> correlationProperty = new ArrayList<>();

    private final List<DataStore> dataStore = new ArrayList<>();

    private final List<EndPoint> endPoint = new ArrayList<>();

    private final List<Error> error = new ArrayList<>();

    private final EventDefinitionList eventDefinition = new EventDefinitionList();

    private final List<GlobalBusinessRuleTask> globalBusinessRuleTask = new ArrayList<>();

    private final List<GlobalManualTask> globalManualTask = new ArrayList<>();

    private final List<GlobalScriptTask> globalScriptTask = new ArrayList<>();

    private final List<GlobalTask> globalTask = new ArrayList<>();

    private final List<GlobalUserTask> globalUserTask = new ArrayList<>();

    private final List<Interface> _interface = new ArrayList<>();

    private final List<ItemDefinition> itemDefinition = new ArrayList<>();

    private final List<Message> message = new ArrayList<>();

    private final List<PartnerEntity> partnerEntity = new ArrayList<>();

    private final List<PartnerRole> partnerRole = new ArrayList<>();

    private final List<Process> process = new ArrayList<>();

    private final List<Resource> resource = new ArrayList<>();

    private final List<Signal> signal = new ArrayList<>();

    private final List<Escalation> escalation = new ArrayList<>();

    private final List<CallConversation> callConversation = new ArrayList<>();

    public List<CallConversation> getCallConversation() {
        return callConversation;
    }

    public List<Escalation> getEscalation() {
        return escalation;
    }

    public List<Category> getCategory() {
        return category;
    }

    public List<Collaboration> getCollaboration() {
        return collaboration;
    }

    public List<CorrelationProperty> getCorrelationProperty() {
        return correlationProperty;
    }

    public List<DataStore> getDataStore() {
        return dataStore;
    }

    public List<EndPoint> getEndPoint() {
        return endPoint;
    }

    public List<Error> getError() {
        return error;
    }

    public EventDefinitionList getEventDefinition() {
        return eventDefinition;
    }

    public List<GlobalBusinessRuleTask> getGlobalBusinessRuleTask() {
        return globalBusinessRuleTask;
    }

    public List<GlobalManualTask> getGlobalManualTask() {
        return globalManualTask;
    }

    public List<GlobalScriptTask> getGlobalScriptTask() {
        return globalScriptTask;
    }

    public List<GlobalTask> getGlobalTask() {
        return globalTask;
    }

    public List<GlobalUserTask> getGlobalUserTask() {
        return globalUserTask;
    }

    public List<Interface> getInterface() {
        return _interface;
    }

    public List<ItemDefinition> getItemDefinition() {
        return itemDefinition;
    }

    public List<Message> getMessage() {
        return message;
    }

    public List<PartnerEntity> getPartnerEntity() {
        return partnerEntity;
    }

    public List<PartnerRole> getPartnerRole() {
        return partnerRole;
    }

    public List<Process> getProcess() {
        return process;
    }

    public List<Resource> getResource() {
        return resource;
    }

    public List<Signal> getSignal() {
        return signal;
    }
}
