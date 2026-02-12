package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

public abstract class BaseElement<T extends ExtensionElements> {

    private String id;

    private final Map<QName, String> otherAttributes = new HashMap<>();

    private final List<Documentation> documentations = new ArrayList<>();

    private T extensionElements;

    public List<Documentation> getDocumentations() {
        return documentations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public T getExtensionElements() {
        return extensionElements;
    }

    public void setExtensionElements(T extensionElements) {
        this.extensionElements = extensionElements;
    }
}
