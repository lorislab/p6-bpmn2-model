package org.lorislab.p6.bpmn2.reader;

import static org.lorislab.p6.bpmn2.reader.AttributeReader.ATTR_METHOD;

import org.lorislab.p6.bpmn2.model.Transaction;

public class TransactionReader extends SubProcessReader<Transaction> {

    public TransactionReader() {
        super(Transaction::new);
    }

    @Override
    protected void readAttrs(AttributeReader attrs, Transaction element) throws Exception {
        super.readAttrs(attrs, element);
        // method
        element.setMethod(attrs.getString(ATTR_METHOD, "##Compensate"));
    }
}
