package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example7;

public class Runner {
    public static void main(String[] args) {
        FurnitureFactory factory = new ScandinavianFactory();
        Table table = factory.createTable();
        Chair chair = factory.createChair();
        System.out.println("Furniture Style: " + table.getStyle() + ", " + chair.getStyle());

        factory = new AsianFactory();
        table = factory.createTable();
        chair = factory.createChair();
        System.out.println("Furniture Style: " + table.getStyle() + ", " + chair.getStyle());
    }
}
