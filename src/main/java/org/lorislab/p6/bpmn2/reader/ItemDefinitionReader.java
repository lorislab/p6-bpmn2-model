package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_ITEM_KIND;

import org.lorislab.p6.bpmn2.model.ItemDefinition;

public class ItemDefinitionReader extends RootElementReader<ItemDefinition> {

    public ItemDefinitionReader() {
        super(ItemDefinition::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, ItemDefinition element) throws Exception {
        super.readAttrs(attrs, element);
        // structureRef
        element.setStructureRef(attrs.getString(AttributeReader.ATTR_STRUCTURE_REF));
        // isCollection
        element.setCollection(attrs.getBoolean(AttributeReader.ATTR_IS_COLLECTION, false));
        // itemKind
        element.setItemKind(attrs.getEnum(ATTR_ITEM_KIND, ItemDefinition.ItemKind.class, ItemDefinition.ItemKind.Information));
    }
}
