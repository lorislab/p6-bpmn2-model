package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.LANE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.LaneSet;

public class LaneSetReader extends BaseElementReader<LaneSet> {

    public LaneSetReader() {
        super(LaneSet::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, LaneSet element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, LaneSet element) throws Exception {
        super.readElement(reader, name, element);
        // lane
        readElementSequence(LANE_READER, reader, "lane", element.getLanes());
    }

}
