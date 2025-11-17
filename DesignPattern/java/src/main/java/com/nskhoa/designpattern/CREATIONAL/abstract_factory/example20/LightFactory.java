package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example20;

public class LightFactory implements ThemeAbstractFactory {
    public Style createStyle() {
        return new LightStyle();
    }

    public Component createComponent() {
        return new LightComponent();
    }
}
