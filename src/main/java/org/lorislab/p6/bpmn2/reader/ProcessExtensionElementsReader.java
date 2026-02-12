package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.*;
import static org.lorislab.p6.bpmn2.reader.ZeebeConst.ZEEBE_NAMESPACE_URI;

import java.util.function.Consumer;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ProcessExtensionElements;

public class ProcessExtensionElementsReader extends Reader<ProcessExtensionElements> {

    private static final QName ZEEBE_VERSION_TAG = new QName(ZEEBE_NAMESPACE_URI, "versionTag");

    public ProcessExtensionElementsReader() {
        super(ProcessExtensionElements::new);
    }

    @Override
    public boolean read(XMLStreamReader2 reader, String name, Consumer<ProcessExtensionElements> fn) throws Exception {
        if (!isStartElement(reader, name)) {
            return false;
        }
        var element = createElement(reader, null);

        while (reader.hasNext()) {
            reader.nextTag();

            if (isEndElement(reader, name)) {
                break;
            }

            if (ZEEBE_VERSION_TAG.equals(reader.getName())) {
                ZEEBE_VERSION_TAG_READER.read(reader, ZEEBE_VERSION_TAG.getLocalPart(), element::setZeebeVersionTag);
            } else {
                skipToEndElement(reader, reader.getLocalName());
            }
        }
        fn.accept(element);
        return true;
    }

}
