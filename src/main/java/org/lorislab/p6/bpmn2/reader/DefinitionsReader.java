package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ID;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_NAME;
import static org.lorislab.p6.bpmn2.reader.Readers.*;

import java.util.List;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Definitions;

public class DefinitionsReader extends Reader<Definitions> {

    private static final QName ATTR_TARGET_NAMESPACE = new QName("targetNamespace");
    private static final QName ATTR_EXPRESSION_LANG = new QName("expressionLanguage");
    private static final QName ATTR_TYPE_LANG = new QName("typeLanguage");
    private static final QName ATTR_EXPORTER = new QName("exporter");
    private static final QName ATTR_EXPORTER_VERSION = new QName("exporterVersion");

    private static final QName ATTR_ZEEBE_EXEC_PLATFORM = new QName("http://camunda.org/schema/modeler/1.0",
            "executionPlatform");
    private static final QName ATTR_ZEEBE_EXEC_PLATFORM_VERSION = new QName("http://camunda.org/schema/modeler/1.0",
            "executionPlatformVersion");

    public DefinitionsReader() {
        super(Definitions::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Definitions element) throws Exception {
        element.setId(attrs.getString(ATTR_ID));
        element.setName(attrs.getString(ATTR_NAME));
        element.setTargetNamespace(attrs.getString(ATTR_TARGET_NAMESPACE, true));
        element.setExpressionLanguage(attrs.getString(ATTR_EXPRESSION_LANG, "http://www.w3.org/1999/XPath"));
        element.setTypeLanguage(attrs.getString(ATTR_TYPE_LANG, "http://www.w3.org/2001/XMLSchema"));
        element.setExporter(attrs.getString(ATTR_EXPORTER));
        element.setExporterVersion(attrs.getString(ATTR_EXPORTER_VERSION));
        attrs.readOther(element.getOtherAttributes());

        var zeebeExecPlatform = attrs.getString(ATTR_ZEEBE_EXEC_PLATFORM);
        if (zeebeExecPlatform != null) {
            var zeebeExecPlatformVersion = attrs.getString(ATTR_ZEEBE_EXEC_PLATFORM_VERSION);
            if (zeebeExecPlatformVersion != null) {
                var z = new Definitions.Zeebe();
                z.setExecutionPlatform(zeebeExecPlatform);
                z.setExecutionPlatformVersion(zeebeExecPlatformVersion);
                element.setZeebe(z);
            }
        }
    }

    @Override
    protected void readElement(XMLStreamReader2 reader, String name, Definitions element) throws Exception {
        super.readElement(reader, name, element);
        // import
        readElementSequence(IMPORT_READER, reader, "import", element.getImports());
        // extension
        readElementSequence(EXTENSION_READER, reader, "extension", element.getExtension());
        // rootElement
        ReaderItems.readRootElements(reader, element.getRootElement());
        // BPMNDiagram
        readElementSequence(BPMN_DIAGRAM_READER, reader, "BPMNDiagram", List.of());
        // relationship
        readElementSequence(RELATIONSHIP_READER, reader, "relationship", element.getRelationship());
    }

}
