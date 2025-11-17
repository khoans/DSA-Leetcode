package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example20;

public class Runner {
    public static void main(String[] args) {
        ThemeAbstractFactory factory = new LightFactory();
        Style style = factory.createStyle();
        Component component = factory.createComponent();
        System.out.println("Style Color: " + style.getColor());
        component.display();

        factory = new DarkFactory();
        style = factory.createStyle();
        component = factory.createComponent();
        System.out.println("Style Color: " + style.getColor());
        component.display();
    }
}
