package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public class InvoiceGenerator implements Generator {
    public String generate(String data) {
        return "Invoice Generated";
    }
}
