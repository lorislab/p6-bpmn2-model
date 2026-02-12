package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_SCRIPT_LANGUAGE;
import static org.lorislab.p6.bpmn2.reader.Readers.SCRIPT_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.GlobalScriptTask;

public class GlobalScriptTaskReader extends AbstractGlobalTaskReader<GlobalScriptTask> {

    public GlobalScriptTaskReader() {
        super(GlobalScriptTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, GlobalScriptTask element) throws Exception {
        super.readAttrs(attrs, element);
        // scriptLanguage
        element.setScriptLanguage(attrs.getString(ATTR_SCRIPT_LANGUAGE));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, GlobalScriptTask element) throws Exception {
        super.readElement(reader, name, element);
        // script
        readElementSequenceItem(SCRIPT_READER, reader, "script", element::setScript);
    }
}
