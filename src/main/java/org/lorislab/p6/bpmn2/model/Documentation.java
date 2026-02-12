package org.lorislab.p6.bpmn2.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

public class Documentation {

    private String id;

    private String textFormat;

    private final Map<QName, String> any = new HashMap<>();

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

    public String getTextFormat() {
        return textFormat;
    }

    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    public Map<QName, String> getAny() {
        return any;
    }

}
