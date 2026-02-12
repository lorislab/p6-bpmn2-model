package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_IMPLEMENTATION;

import org.lorislab.p6.bpmn2.model.GlobalBusinessRuleTask;

public class GlobalBusinessRuleTaskReader extends AbstractGlobalTaskReader<GlobalBusinessRuleTask> {

    public GlobalBusinessRuleTaskReader() {
        super(GlobalBusinessRuleTask::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, GlobalBusinessRuleTask element) throws Exception {
        super.readAttrs(attrs, element);
        // implementation
        element.setImplementation(attrs.getString(ATTR_IMPLEMENTATION, "##unspecified"));
    }
}
