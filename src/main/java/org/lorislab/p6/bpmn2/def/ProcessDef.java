package org.lorislab.p6.bpmn2.def;

import static java.util.stream.Collectors.toUnmodifiableMap;

import java.util.Map;

import org.lorislab.p6.bpmn2.model.Definitions;
import org.lorislab.p6.bpmn2.model.FlowElement;
import org.lorislab.p6.bpmn2.model.Process;

public class ProcessDef {

    private static final String VERSION_NONE = "0";

    private final Definitions definitions;

    private final Process process;

    private final Map<String, FlowElement> elements;

    public static ProcessDef of(Definitions definitions, Process process) {
        return new ProcessDef(definitions, process);
    }

    public static ProcessDef of(Definitions definitions, String processId) {
        var process = definitions.getRootElement().getProcess().stream().filter(x -> processId.equals(x.getId())).findFirst();
        return process.map(value -> ProcessDef.of(definitions, value)).orElse(null);
    }

    private ProcessDef(Definitions definitions, Process process) {
        this.definitions = definitions;
        this.process = process;
        elements = process.getFlowElement().stream().collect(toUnmodifiableMap(FlowElement::getId, e -> e));
    }

    public Definitions getDefinitions() {
        return definitions;
    }

    public Map<String, FlowElement> getElements() {
        return elements;
    }

    public Process getProcess() {
        return process;
    }

    public String getVersion() {
        var e = process.getExtensionElements();
        if (e != null) {
            // zeebe process
            if (e.getZeebeVersionTag() != null) {
                var v = e.getZeebeVersionTag().getValue();
                if (v != null && !v.isBlank()) {
                    return v;
                }
            }
        }
        return VERSION_NONE;
    }
}
