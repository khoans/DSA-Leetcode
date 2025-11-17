package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example11;

public class MacFactory implements GUIAbstractFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Window createWindow() {
        return new MacWindow();
    }
}
