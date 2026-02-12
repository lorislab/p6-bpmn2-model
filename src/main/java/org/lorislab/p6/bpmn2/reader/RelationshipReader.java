package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Relationship;

public class RelationshipReader extends BaseElementReader<Relationship> {

    private static final QName ATTR_TYPE = new QName("type");
    private static final QName ATTR_DIRECTION = new QName("direction");

    public RelationshipReader() {
        super(Relationship::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Relationship element) throws Exception {
        super.readAttrs(attrs, element);
        // type
        element.setType(attrs.getString(ATTR_TYPE, true));
        // direction
        element.setRelationshipDirection(attrs.getEnum(ATTR_DIRECTION, Relationship.RelationshipDirection.class, null));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Relationship element) throws Exception {
        super.readElement(reader, name, element);
        // source
        readTextElementList(reader, "source", element.getSource(), 1);
        // target
        readTextElementList(reader, "target", element.getSource(), 1);
    }

}
