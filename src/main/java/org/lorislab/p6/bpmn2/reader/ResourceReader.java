package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.RESOURCE_PARAMETER_READER;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Resource;

public class ResourceReader extends RootElementReader<Resource> {

    public ResourceReader() {
        super(Resource::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Resource element) throws Exception {
        super.readAttrs(attrs, element);
        // name
        element.setName(attrs.getString(AttributeReader.ATTR_NAME));
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Resource element) throws Exception {
        super.readElement(reader, name, element);
        // resourceParameter
        readElementSequence(RESOURCE_PARAMETER_READER, reader, "resourceParameter", element.getResourceParameter());
    }

}
