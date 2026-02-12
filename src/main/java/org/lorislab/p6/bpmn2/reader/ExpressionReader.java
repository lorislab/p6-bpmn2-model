package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.Readers.FORMAL_EXPRESSION_READER;

import javax.xml.namespace.QName;

import org.codehaus.stax2.XMLStreamReader2;
import org.lorislab.p6.bpmn2.model.Expression;
import org.lorislab.p6.bpmn2.model.FormalExpression;

public class ExpressionReader extends BaseElementWithMixedContentReader<Expression> {

    public ExpressionReader() {
        super(Expression::new);
    }

    @Override
    protected Expression createElement(XMLStreamReader2 reader, AttributeReader attrs) {
        var attr = attrs.getString(new QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
        if (attr != null && attr.endsWith("tFormalExpression")) {
            return new FormalExpression();
        }
        return new Expression();
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Expression element) throws Exception {
        switch (element.getExpressionClass()) {
            case EXPRESSION -> super.readAttrs(attrs, element);
            case FORMAL_EXPRESSION -> FORMAL_EXPRESSION_READER.readAttrs(attrs, (FormalExpression) element);
        }
    }

}
