package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example8;

public class Runner {
    public static void main(String[] args) {
        OfficeFactory factory = new A4Factory();
        Paper paper = factory.createPaper();
        Pen pen = factory.createPen();
        System.out.println("Paper size: " + paper.getSize());
        System.out.println("Pen size: " + pen.getSize());

        factory = new PersonalFactory();
        paper = factory.createPaper();
        pen = factory.createPen();
        System.out.println("Paper size: " + paper.getSize());
        System.out.println("Pen size: " + pen.getSize());
    }
}
