package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.RENDERING_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.UserTask;

public class UserTaskReader extends ActivityReader<UserTask> {

    public UserTaskReader() {
        super(UserTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, UserTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##unspecified"));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, UserTask element) throws Exception {
        super.readElement(reader, name, element);
        // rendering
        readElementSequence(RENDERING_READER, reader, "rendering", element.getRendering());
    }
}
