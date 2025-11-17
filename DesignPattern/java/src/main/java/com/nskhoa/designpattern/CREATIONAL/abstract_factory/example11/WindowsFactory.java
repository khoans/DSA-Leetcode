package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example11;

public class WindowsFactory implements GUIAbstractFactory {
    public Button createButton() { return new WindowsButton(); }
    public Window createWindow() { return new WindowsWindow(); }
}
