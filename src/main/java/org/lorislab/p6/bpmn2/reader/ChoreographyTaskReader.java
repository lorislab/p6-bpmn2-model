package org.lorislab.p6.bpmn2.reader;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ChoreographyTask;

public class ChoreographyTaskReader extends ChoreographyActivityReader<ChoreographyTask> {

    public ChoreographyTaskReader() {
        super(ChoreographyTask::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ChoreographyTask element) throws Exception {
        super.readElement(reader, name, element);
        // messageFlowRef
        readTextElementList(reader, "messageFlowRef", element.getMessageFlowRef(), 1, 2);
    }
}
