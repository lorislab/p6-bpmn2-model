package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.Group;

public class GroupReader extends ArtifactReader<Group> {

    private static final QName ATTR_CATEGORY_VALUE_REF = new QName("categoryValueRef");

    public GroupReader() {
        super(Group::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Group element) throws Exception {
        super.readAttrs(attrs, element);
        // categoryValueRef
        element.setCategoryValueRef(attrs.getString(ATTR_CATEGORY_VALUE_REF));
    }
}
