package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.CATEGORY_VALUE_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Category;

public class CategoryReader extends RootElementReader<Category> {

    public CategoryReader() {
        super(Category::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Category element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Category element) throws Exception {
        super.readElement(reader, name, element);
        // categoryValue
        readElementSequence(CATEGORY_VALUE_READER, reader, "categoryValue", element.getCategoryValue());
    }

}
