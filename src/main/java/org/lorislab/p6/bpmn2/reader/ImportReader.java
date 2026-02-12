package org.lorislab.p6.bpmn2.reader;

import javax.xml.namespace.QName;

import org.lorislab.p6.bpmn2.model.Import;

public class ImportReader extends Reader<Import> {

    private static final QName ATTR_NAMESPACE = new QName("namespace");
    private static final QName ATTR_LOCATION = new QName("location");
    private static final QName ATTR_IMPORT_TYPE = new QName("importType");

    public ImportReader() {
        super(Import::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Import element) throws Exception {
        // namespace
        element.setNamespace(attrs.getString(ATTR_NAMESPACE, true));
        // location
        element.setLocation(attrs.getString(ATTR_LOCATION, true));
        // importType
        element.setImportType(attrs.getString(ATTR_IMPORT_TYPE, true));
    }
}
