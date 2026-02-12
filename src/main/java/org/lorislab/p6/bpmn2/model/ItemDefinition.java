package org.lorislab.p6.bpmn2.model;

public class ItemDefinition extends RootElement<ExtensionElements> {

    private String structureRef;

    private boolean isCollection;

    private ItemKind itemKind;

    public ItemDefinition() {
        super(RootElementClass.ITEM_DEFINITION);
    }

    public enum ItemKind {
        Information,
        Physical;
    }

    public String getStructureRef() {
        return structureRef;
    }

    public void setStructureRef(String structureRef) {
        this.structureRef = structureRef;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public ItemKind getItemKind() {
        return itemKind;
    }

    public void setItemKind(ItemKind itemKind) {
        this.itemKind = itemKind;
    }
}
