package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example20;

public interface ThemeAbstractFactory {
    Style createStyle();

    Component createComponent();
}

// Usage: ThemeAbstractFactory factory = new LightFactory(); Style style = factory.createStyle(); System.out.println(style.getColor());

