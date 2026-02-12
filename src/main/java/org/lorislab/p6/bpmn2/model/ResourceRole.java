package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class ResourceRole extends BaseElement<ExtensionElements> {

    private String name;

    private String resourceRef;

    private final List<ResourceParameterBinding> resourceParameterBinding = new ArrayList<>();

    private ResourceAssignmentExpression resourceAssignmentExpression;

    private final ResourceRoleClass resourceRoleClass;

    public ResourceRole() {
        this(ResourceRoleClass.RESOURCE_ROLE);
    }

    public ResourceRole(ResourceRoleClass resourceRoleClass) {
        this.resourceRoleClass = resourceRoleClass;
    }

    public ResourceRoleClass getResourceRoleClass() {
        return resourceRoleClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceRef() {
        return resourceRef;
    }

    public void setResourceRef(String resourceRef) {
        this.resourceRef = resourceRef;
    }

    public List<ResourceParameterBinding> getResourceParameterBinding() {
        return resourceParameterBinding;
    }

    public ResourceAssignmentExpression getResourceAssignmentExpression() {
        return resourceAssignmentExpression;
    }

    public void setResourceAssignmentExpression(ResourceAssignmentExpression resourceAssignmentExpression) {
        this.resourceAssignmentExpression = resourceAssignmentExpression;
    }

    public enum ResourceRoleClass {
        RESOURCE_ROLE,
        PERFORMER;
    }
}
