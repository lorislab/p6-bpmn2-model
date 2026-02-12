package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class GlobalTask extends CallableElement<ExtensionElements> {

    private final List<ResourceRole> resourceRole = new ArrayList<>();

    public List<ResourceRole> getResourceRole() {
        return resourceRole;
    }

}
