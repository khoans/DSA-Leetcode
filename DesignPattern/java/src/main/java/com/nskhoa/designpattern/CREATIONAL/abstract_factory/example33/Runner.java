package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example33;

// Usage: MobileAbstractFactory factory = new AndroidFactory(); View view = factory.createView(); view.display();
public class Runner {
    public static void main(String[] args) {
        MobileAbstractFactory factory = new AndroidFactory();
        View view = factory.createView();
        Layout layout = factory.createLayout();
        view.display();
        System.out.println("Layout Structure: " + layout.getStructure());

        factory = new iOSFactory();
        view = factory.createView();
        layout = factory.createLayout();
        view.display();
        System.out.println("Layout Structure: " + layout.getStructure());
    }
}
