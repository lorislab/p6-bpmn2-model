package org.lorislab.p6.bpmn2.reader;

import org.lorislab.p6.bpmn2.model.BusinessRuleTask;

public class BusinessRuleTaskReader extends ActivityReader<BusinessRuleTask> {
    public BusinessRuleTaskReader() {
        super(BusinessRuleTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, BusinessRuleTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(AttributeReader.ATTR_IMPLEMENTATION, "##unspecified"));
    }
}
