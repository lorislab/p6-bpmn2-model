package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.RENDERING_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.GlobalUserTask;

public class GlobalUserTaskReader extends AbstractGlobalTaskReader<GlobalUserTask> {

    public GlobalUserTaskReader() {
        super(GlobalUserTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, GlobalUserTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##unspecified"));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, GlobalUserTask element) throws Exception {
        super.readElement(reader, name, element);
        // rendering
        readElementSequence(RENDERING_READER, reader, "rendering", element.getRendering());
    }
}
