package org.lorislab.p6.bpmn2.model;

public class GlobalScriptTask extends GlobalTask {

    private String scriptLanguage;

    private Script script;

    public String getScriptLanguage() {
        return scriptLanguage;
    }

    public void setScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }
}
