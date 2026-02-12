package org.lorislab.p6.bpmn2.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceTaskExtensionElements extends ExtensionElements {

    private ZeebeTaskDefinition zeebeTaskDefinition;

    private ZeebeTaskHeaders zeebeTaskHeaders;

    private ZeebeIOMapping zeebeIOMapping;

    private ZeebeProperties zeebeProperties;

    private ZeebeExecutionListeners zeebeExecutionListeners;

    public ZeebeTaskDefinition getZeebeTaskDefinition() {
        return zeebeTaskDefinition;
    }

    public void setZeebeTaskDefinition(ZeebeTaskDefinition zeebeTaskDefinition) {
        this.zeebeTaskDefinition = zeebeTaskDefinition;
    }

    public ZeebeTaskHeaders getZeebeTaskHeaders() {
        return zeebeTaskHeaders;
    }

    public void setZeebeTaskHeaders(ZeebeTaskHeaders zeebeTaskHeaders) {
        this.zeebeTaskHeaders = zeebeTaskHeaders;
    }

    public ZeebeIOMapping getZeebeIOMapping() {
        return zeebeIOMapping;
    }

    public void setZeebeIOMapping(ZeebeIOMapping zeebeIOMapping) {
        this.zeebeIOMapping = zeebeIOMapping;
    }

    public ZeebeProperties getZeebeProperties() {
        return zeebeProperties;
    }

    public void setZeebeProperties(ZeebeProperties zeebeProperties) {
        this.zeebeProperties = zeebeProperties;
    }

    public ZeebeExecutionListeners getZeebeExecutionListeners() {
        return zeebeExecutionListeners;
    }

    public void setZeebeExecutionListeners(ZeebeExecutionListeners zeebeExecutionListeners) {
        this.zeebeExecutionListeners = zeebeExecutionListeners;
    }

    public static class ZeebeExecutionListeners {

        private List<ZeebeExecutionListener> listeners = new ArrayList<>();

        public List<ZeebeExecutionListener> getListeners() {
            return listeners;
        }

        public void setListeners(List<ZeebeExecutionListener> listeners) {
            this.listeners = listeners;
        }
    }

    public static class ZeebeExecutionListener {

        private String type;

        private Integer retries;

        private String event;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public Integer getRetries() {
            return retries;
        }

        public void setRetries(Integer retries) {
            this.retries = retries;
        }
    }

    public static class ZeebeProperties {

        private List<ZeebeProperty> properties = new ArrayList<>();

        private String example;

        public String getExample() {
            return example;
        }

        public void setExample(String example) {
            this.example = example;
        }

        public List<ZeebeProperty> getProperties() {
            return properties;
        }

        public void setProperties(List<ZeebeProperty> properties) {
            this.properties = properties;
        }
    }

    public static class ZeebeProperty {

        private String name;

        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ZeebeIOMapping {

        private List<ZeebeIOMappingInput> input = new ArrayList<>();

        private List<ZeebeIOMappingOutput> output = new ArrayList<>();

        public List<ZeebeIOMappingInput> getInput() {
            return input;
        }

        public void setInput(List<ZeebeIOMappingInput> input) {
            this.input = input;
        }

        public List<ZeebeIOMappingOutput> getOutput() {
            return output;
        }

        public void setOutput(List<ZeebeIOMappingOutput> output) {
            this.output = output;
        }
    }

    public static class ZeebeIOMappingInput {

        private String source;

        private String target;

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }
    }

    public static class ZeebeIOMappingOutput {

        private String source;

        private String target;

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }
    }

    public static class ZeebeTaskHeaders {

        private List<ZeebeTaskHeader> headers = new ArrayList<>();

        public List<ZeebeTaskHeader> getHeaders() {
            return headers;
        }

        public void setHeaders(List<ZeebeTaskHeader> headers) {
            this.headers = headers;
        }
    }

    public static class ZeebeTaskHeader {

        private String key;

        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ZeebeTaskDefinition {

        private String type;

        private String retries;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRetries() {
            return retries;
        }

        public void setRetries(String retries) {
            this.retries = retries;
        }
    }
}
