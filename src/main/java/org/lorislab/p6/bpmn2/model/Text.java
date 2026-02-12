package org.lorislab.p6.bpmn2.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

public class Text {

    private String content;

    private final Map<QName, String> any = new HashMap<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<QName, String> getAny() {
        return any;
    }

    public void putAny(QName name, String value) {
        this.any.put(name, value);
    }
}
