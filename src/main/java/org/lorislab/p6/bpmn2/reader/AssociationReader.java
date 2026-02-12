package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.Association;

public class AssociationReader extends ArtifactReader<Association> {

    private static final QName ATTR_SOURCE_REF = new QName("sourceRef");
    private static final QName ATTR_TARGET_REF = new QName("targetRef");
    private static final QName ATTR_ASSOCIATION_DIRECTION = new QName("associationDirection");

    public AssociationReader() {
        super(Association::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Association element) throws Exception {
        super.readAttrs(attrs, element);
        // sourceRef
        element.setSourceRef(attrs.getString(ATTR_SOURCE_REF, true));
        // targetRef
        element.setTargetRef(attrs.getString(ATTR_TARGET_REF, true));
        // associationDirection
        element.setAssociationDirection(attrs.getEnum(ATTR_ASSOCIATION_DIRECTION, Association.AssociationDirection.class,
                Association.AssociationDirection.None));
    }
}
