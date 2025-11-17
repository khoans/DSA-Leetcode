package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example11;

public class Runner {
    public static void main(String[] args) {
        GUIAbstractFactory factory = new WindowsFactory();
        Button btn = factory.createButton();
        Window win = factory.createWindow();
        btn.render();
        win.draw();

        factory = new MacFactory();
        btn = factory.createButton();
        win = factory.createWindow();
        btn.render();
        win.draw();
    }
}
