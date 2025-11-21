package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public class InvoiceFactory implements DocumentAbstractFactory {
    public Generator createGenerator() {
        return new InvoiceGenerator();
    }

    public Formatter createFormatter() {
        return new InvoiceFormatter();
    }
}
