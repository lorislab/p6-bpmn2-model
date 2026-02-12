package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.LANE_SET_READER;
import static org.lorislab.p6.bpmn2.reader.Readers.PARTITION_ELEMENT_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Lane;

public class LaneReader extends BaseElementReader<Lane> {

    protected static final QName ATTR_PARTITION_ELEMENT_REF = new QName(null, "partitionElementRef");

    public LaneReader() {
        super(Lane::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Lane element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(ATTR_NAME));
        // partitionElementRef
        element.setPartitionElementRef(attrs.getString(ATTR_PARTITION_ELEMENT_REF));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Lane element) throws Exception {
        super.readElement(reader, name, element);
        // partitionElement
        readElementSequenceItem(PARTITION_ELEMENT_READER, reader, "partitionElement", element::setPartitionElement);
        // flowNodeRef
        readTextElementList(reader, "flowNodeRef", element.getFlowNodeRef());
        // childLaneSet
        readElementSequenceItem(LANE_SET_READER, reader, "childLaneSet", element::setChildLaneSet);
    }

}
