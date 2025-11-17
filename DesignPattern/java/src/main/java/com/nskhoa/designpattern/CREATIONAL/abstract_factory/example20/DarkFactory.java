package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example20;

public class DarkFactory implements ThemeAbstractFactory {
    public Style createStyle() {
        return new DarkStyle();
    }

    public Component createComponent() {
        return new DarkComponent();
    }
}
