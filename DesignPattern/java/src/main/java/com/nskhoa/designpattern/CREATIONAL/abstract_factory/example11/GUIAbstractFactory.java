package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example11;

public interface GUIAbstractFactory {
    Button createButton();

    Window createWindow();
}

// Usage: GUIAbstractFactory factory = new WindowsFactory(); Button btn = factory.createButton(); btn.render();

