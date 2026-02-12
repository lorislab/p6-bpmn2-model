package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_CANCEL_REMAINING_INSTANCES;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ORDERING;
import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.AdHocSubProcess;

public class AdHocSubProcessReader extends SubProcessReader<AdHocSubProcess> {

    public AdHocSubProcessReader() {
        super(AdHocSubProcess::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, AdHocSubProcess element) throws Exception {
        super.readAttrs(attrs, element);
        // cancelRemainingInstances
        element.setCancelRemainingInstances(attrs.getBoolean(ATTR_CANCEL_REMAINING_INSTANCES, true));
        // ordering
        element.setOrdering(attrs.getEnum(ATTR_ORDERING, AdHocSubProcess.AdHocOrdering.class, null));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, AdHocSubProcess element) throws Exception {
        super.readElement(reader, name, element);
        // completionCondition
        readElementSequenceItem(EXPRESSION_READER, reader, "completionCondition", element::setCompletionCondition);
    }
}
