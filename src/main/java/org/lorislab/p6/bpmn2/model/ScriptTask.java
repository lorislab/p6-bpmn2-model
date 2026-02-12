package org.lorislab.p6.bpmn2.model;

public class ScriptTask extends Task<ExtensionElements> {

    private String scriptFormat;

    private Script script;

    public ScriptTask() {
        super(FlowElementClass.SCRIPT_TASK);
    }

    public String getScriptFormat() {
        return scriptFormat;
    }

    public void setScriptFormat(String scriptFormat) {
        this.scriptFormat = scriptFormat;
    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }
}
