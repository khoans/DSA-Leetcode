package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public class ReportFactory implements DocumentAbstractFactory {
    public Generator createGenerator() {
        return new ReportGenerator();
    }

    public Formatter createFormatter() {
        return new ReportFormatter();
    }
}
