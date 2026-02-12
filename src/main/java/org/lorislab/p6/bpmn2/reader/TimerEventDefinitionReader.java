package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.EXPRESSION_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.TimerEventDefinition;

public class TimerEventDefinitionReader extends EventDefinitionReader<TimerEventDefinition> {
    public TimerEventDefinitionReader() {
        super(TimerEventDefinition::new);
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, TimerEventDefinition element) throws Exception {
        super.readElement(reader, name, element);

        var localName = reader.getLocalName();
        switch (localName) {
            case "timeDate" -> readElementSequenceItem(EXPRESSION_READER, reader, localName, element::setTimeDate);
            case "timeDuration" -> readElementSequenceItem(EXPRESSION_READER, reader, localName, element::setTimeDuration);
            case "timeCycle" -> readElementSequenceItem(EXPRESSION_READER, reader, localName, element::setTimeCycle);
        }
    }
}
