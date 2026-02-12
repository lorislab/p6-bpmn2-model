package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_INITIATING_PARTICIPANT_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_LOOP_TYPE;
import static org.lorislab.p6.bpmn2.reader.Readers.CORRELATION_KEY_READER;

import java.util.function.Supplier;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.ChoreographyActivity;

public class ChoreographyActivityReader<T extends ChoreographyActivity> extends FlowNodeReader<T> {

    public ChoreographyActivityReader(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, T element) throws Exception {
        super.readAttrs(attrs, element);
        // initiatingParticipantRef
        element.setInitiatingParticipantRef(attrs.getString(ATTR_INITIATING_PARTICIPANT_REF, true));
        // loopType
        element.setLoopType(attrs.getEnum(ATTR_LOOP_TYPE, ChoreographyActivity.ChoreographyLoopType.class,
                ChoreographyActivity.ChoreographyLoopType.None));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, T element) throws Exception {
        super.readElement(reader, name, element);
        // participantRef
        readTextElementList(reader, "participantRef", element.getParticipantRef(), 2);
        // correlationKey
        readElementSequence(CORRELATION_KEY_READER, reader, "correlationKey", element.getCorrelationKey());
    }
}
