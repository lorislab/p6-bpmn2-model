package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_TRIGGERED_BY_EVENT;
import static org.lorislab.p6.bpmn2.reader.Readers.LANE_SET_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.SubProcess;

public class SubProcessReader<T extends SubProcess> extends ActivityReader<T> {

    public SubProcessReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // triggeredByEvent
        element.setTriggeredByEvent(attrs.getBoolean(ATTR_TRIGGERED_BY_EVENT, false));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // laneSet
        readElementSequence(LANE_SET_READER, reader, "laneSet", element.getLaneSet());
        // flowElement
        ReaderItems.readFlowElements(reader, element.getFlowElement());
        // artifact
        ReaderItems.readArtifacts(reader, element.getArtifact());
    }
}
