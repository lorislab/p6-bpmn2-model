package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_IS_CLOSED;
import static org.lorislab.p6.bpmn2.reader.Readers.*;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Process;

public class ProcessReader extends CallableElementReader<Process> {

    private static final QName ATTR_PROCESS_TYPE = new QName("processType");
    private static final QName ATTR_IS_EXECUTABLE = new QName("isExecutable");
    private static final QName ATTR_DEF_COLLABORATION_REF = new QName("definitionalCollaborationRef");

    public ProcessReader() {
        super(Process::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Process element) throws Exception {
        super.readAttrs(attrs, element);
        // processType
        element.setProcessType(attrs.getEnum(ATTR_PROCESS_TYPE, Process.ProcessType.class, Process.ProcessType.None));
        // isClosed
        element.setClosed(attrs.getBoolean(ATTR_IS_CLOSED, false));
        // isExecutable
        element.setExecutable(attrs.getBoolean(ATTR_IS_EXECUTABLE, false));
        // definitionalCollaborationRef
        element.setDefinitionalCollaborationRef(attrs.getString(ATTR_DEF_COLLABORATION_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Process element) throws Exception {
        super.readElement(reader, name, element);
        // auditing
        readElementSequenceItem(AUDITING_READER, reader, "auditing", element::setAuditing);
        // monitoring
        readElementSequenceItem(MONITORING_READER, reader, "monitoring", element::setMonitoring);
        // property
        readElementSequence(PROPERTY_READER, reader, "property", element.getProperties());
        // laneSet
        readElementSequence(LANE_SET_READER, reader, "laneSet", element.getLaneSets());

        // flowElement
        ReaderItems.readFlowElements(reader, element.getFlowElement());

        // artifact
        ReaderItems.readArtifacts(reader, element.getArtifact());

        // resourceRole
        ReaderItems.readResourceRole(reader, element.getResourceRole());
        // correlationSubscription
        readElementSequence(CORRELATION_SUBSCRIPTION_READER, reader, "correlationSubscription",
                element.getCorrelationSubscription());
        // supports
        readTextElementList(reader, "supports", element.getSupports());
    }

    @Override
    protected void readExtensionElements(XMLStreamReader2 reader, Process element) throws Exception {
        readElementSequenceItem(PROCESS_EXTENSION_ELEMENTS_READER, reader, ELEMENT_EXTENSIONS_ELEMENTS,
                element::setExtensionElements);
    }
}
