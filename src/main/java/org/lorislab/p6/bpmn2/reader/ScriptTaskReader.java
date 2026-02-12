package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_SCRIPT_FORMAT;
import static org.lorislab.p6.bpmn2.reader.Readers.SCRIPT_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ScriptTask;

public class ScriptTaskReader extends ActivityReader<ScriptTask> {

    public ScriptTaskReader() {
        super(ScriptTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ScriptTask element) throws Exception {
        super.readAttrs(attrs, element);
        // scriptFormat
        element.setScriptFormat(attrs.getString(ATTR_SCRIPT_FORMAT));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, ScriptTask element) throws Exception {
        super.readElement(reader, name, element);
        // script
        readElementSequenceItem(SCRIPT_READER, reader, "script", element::setScript);
    }
}
