package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

public abstract class BaseElementWithMixedContent {

    private String id;

    private final Map<QName, String> otherAttributes = new HashMap<>();

    private final List<Documentation> documentation = new ArrayList<>();

    private ExtensionElements extensionElements;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public List<Documentation> getDocumentation() {
        return documentation;
    }

    public ExtensionElements getExtensionElements() {
        return extensionElements;
    }

    public void setExtensionElements(ExtensionElements extensionElements) {
        this.extensionElements = extensionElements;
    }
}
