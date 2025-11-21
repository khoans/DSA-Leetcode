package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public class InvoiceFormatter implements Formatter {
    public void format(String content) {
        System.out.println("Invoice Formatted: " + content);
    }
}
