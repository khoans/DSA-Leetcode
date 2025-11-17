package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example8;

public class PersonalFactory implements OfficeFactory {
    public Paper createPaper() {
        return new PersonalPaper();
    }

    public Pen createPen() {
        return new PersonalPen();
    }
}
