package org.lorislab.p6.bpmn2.model;

public class TextAnnotation extends Artifact {

    private String textFormat;

    private Text text;

    public TextAnnotation() {
        super(ArtifactClass.TEXT_ANNOTATION);
    }

    public String getTextFormat() {
        return textFormat;
    }

    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
