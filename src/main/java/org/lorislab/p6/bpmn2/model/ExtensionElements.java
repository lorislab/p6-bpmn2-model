package org.lorislab.p6.bpmn2.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

public class ExtensionElements implements ExtensionE {

    private final Map<QName, String> other = new HashMap<>();

    public Map<QName, String> getOther() {
        return other;
    }

}
