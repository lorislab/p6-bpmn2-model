package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class FlowNode<T extends ExtensionElements> extends FlowElement<T> {

    private final List<String> incoming = new ArrayList<>();

    private final List<String> outgoing = new ArrayList<>();

    protected FlowNode(FlowElementClass flowElementClass) {
        super(flowElementClass);
    }

    public List<String> getIncoming() {
        return incoming;
    }

    public List<String> getOutgoing() {
        return outgoing;
    }

}
