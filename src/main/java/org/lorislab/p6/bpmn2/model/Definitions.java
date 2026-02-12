package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

public class Definitions {

    private String id;

    private String name;

    private String targetNamespace;

    private String expressionLanguage;

    private String typeLanguage;

    private String exporter;

    private String exporterVersion;

    private Zeebe zeebe;

    private final List<Import> imports = new ArrayList<>();

    private final List<Extension> extension = new ArrayList<>();

    private final Map<QName, String> otherAttributes = new HashMap<>();

    private final RootElementItems rootElement = new RootElementItems();

    private final List<Relationship> relationship = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    public void setExpressionLanguage(String expressionLanguage) {
        this.expressionLanguage = expressionLanguage;
    }

    public String getTypeLanguage() {
        return typeLanguage;
    }

    public void setTypeLanguage(String typeLanguage) {
        this.typeLanguage = typeLanguage;
    }

    public String getExporter() {
        return exporter;
    }

    public void setExporter(String exporter) {
        this.exporter = exporter;
    }

    public String getExporterVersion() {
        return exporterVersion;
    }

    public void setExporterVersion(String exporterVersion) {
        this.exporterVersion = exporterVersion;
    }

    public Zeebe getZeebe() {
        return zeebe;
    }

    public void setZeebe(Zeebe zeebe) {
        this.zeebe = zeebe;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public RootElementItems getRootElement() {
        return rootElement;
    }

    public List<Relationship> getRelationship() {
        return relationship;
    }

    public List<Import> getImports() {
        return imports;
    }

    public List<Extension> getExtension() {
        return extension;
    }

    public static class Zeebe {

        private String executionPlatform;

        private String executionPlatformVersion;

        public String getExecutionPlatform() {
            return executionPlatform;
        }

        public void setExecutionPlatform(String executionPlatform) {
            this.executionPlatform = executionPlatform;
        }

        public String getExecutionPlatformVersion() {
            return executionPlatformVersion;
        }

        public void setExecutionPlatformVersion(String executionPlatformVersion) {
            this.executionPlatformVersion = executionPlatformVersion;
        }
    }
}
