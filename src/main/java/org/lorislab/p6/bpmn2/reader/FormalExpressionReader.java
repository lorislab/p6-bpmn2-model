package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_EVALUATES_TO_TYPE_REF;
import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_LANGUAGE;

import org.lorislab.p6.bpmn2.model.FormalExpression;

public class FormalExpressionReader extends BaseElementWithMixedContentReader<FormalExpression> {

    public FormalExpressionReader() {
        super(FormalExpression::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, FormalExpression element) throws Exception {
        super.readAttrs(attrs, element);
        // language
        element.setLanguage(attrs.getString(ATTR_LANGUAGE));
        // evaluatesToTypeRef
        element.setEvaluatesToTypeRef(attrs.getString(ATTR_EVALUATES_TO_TYPE_REF));
    }

}
