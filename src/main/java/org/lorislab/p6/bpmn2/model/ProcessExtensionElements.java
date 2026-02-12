package org.lorislab.p6.bpmn2.model;

public class ProcessExtensionElements extends ExtensionElements {

    private ZeebeVersionTag zeebeVersionTag;

    public ZeebeVersionTag getZeebeVersionTag() {
        return zeebeVersionTag;
    }

    public void setZeebeVersionTag(ZeebeVersionTag zeebeVersionTag) {
        this.zeebeVersionTag = zeebeVersionTag;
    }

    public static class ZeebeVersionTag {

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
