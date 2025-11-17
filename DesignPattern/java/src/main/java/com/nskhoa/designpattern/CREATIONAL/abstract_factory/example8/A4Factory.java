package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example8;

public class A4Factory implements OfficeFactory {
    public Paper createPaper() {
        return new A4Paper();
    }

    public Pen createPen() {
        return new A4Pen();
    }
}
