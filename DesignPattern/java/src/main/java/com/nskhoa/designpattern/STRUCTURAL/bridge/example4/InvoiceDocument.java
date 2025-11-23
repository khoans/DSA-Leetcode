package com.nskhoa.designpattern.STRUCTURAL.bridge.example4;

public class InvoiceDocument extends Document {
    private String data;

    InvoiceDocument(DocumentFormatter formatter, String data) {
        super(formatter);
        this.data = data;
    }

    public void generate() {
        formatter.format(data);
    }
}
