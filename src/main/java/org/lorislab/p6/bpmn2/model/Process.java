package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class Process extends CallableElement<ProcessExtensionElements> {

    private boolean isClosed;

    private boolean isExecutable;

    private String definitionalCollaborationRef;

    private ProcessType processType;

    private Auditing auditing;

    private Monitoring monitoring;

    private final List<Property> properties = new ArrayList<>();

    private final List<LaneSet> laneSets = new ArrayList<>();

    private final List<FlowElement<?>> flowElement = new ArrayList<>();

    private final List<Artifact> artifact = new ArrayList<>();

    private final List<ResourceRole> resourceRole = new ArrayList<>();

    private final List<CorrelationSubscription> correlationSubscription = new ArrayList<>();

    private final List<String> supports = new ArrayList<>();

    public List<String> getSupports() {
        return supports;
    }

    public List<CorrelationSubscription> getCorrelationSubscription() {
        return correlationSubscription;
    }

    public List<ResourceRole> getResourceRole() {
        return resourceRole;
    }

    public List<Artifact> getArtifact() {
        return artifact;
    }

    public List<FlowElement<?>> getFlowElement() {
        return flowElement;
    }

    public List<LaneSet> getLaneSets() {
        return laneSets;
    }

    public List<Property> getProperties() {
        return properties;
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

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isExecutable() {
        return isExecutable;
    }

    public void setExecutable(boolean executable) {
        isExecutable = executable;
    }

    public ProcessType getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessType processType) {
        this.processType = processType;
    }

    public void setDefinitionalCollaborationRef(String definitionalCollaborationRef) {
        this.definitionalCollaborationRef = definitionalCollaborationRef;
    }

    public String getDefinitionalCollaborationRef() {
        return definitionalCollaborationRef;
    }

    public enum ProcessType {
        None,
        Public,
        Private
    }
}
