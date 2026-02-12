package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.SubChoreography;

public class SubChoreographyReader extends ChoreographyActivityReader<SubChoreography> {

    public SubChoreographyReader() {
        super(SubChoreography::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, SubChoreography element) throws Exception {
        super.readElement(reader, name, element);
        // artifact
        ReaderItems.readArtifacts(reader, element.getArtifact());
        // flowElement
        ReaderItems.readFlowElements(reader, element.getFlowElement());
    }
}
