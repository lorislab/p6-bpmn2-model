package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.CategoryValue;

public class CategoryValueReader extends BaseElementReader<CategoryValue> {

    private static final QName ATTR_VALUE = new QName("value");

    public CategoryValueReader() {
        super(CategoryValue::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, CategoryValue element) throws Exception {
        super.readAttrs(attrs, element);
        // value
        element.setValue(attrs.getString(ATTR_VALUE));
    }

}
