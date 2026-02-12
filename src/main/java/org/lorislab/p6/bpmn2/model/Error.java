package org.lorislab.p6.bpmn2.model;

public class Error extends RootElement<ExtensionElements> {

    private String name;

    private String errorCode;

    private String structureRef;

    public Error() {
        super(RootElementClass.ERROR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getStructureRef() {
        return structureRef;
    }

    public void setStructureRef(String structureRef) {
        this.structureRef = structureRef;
    }
}
