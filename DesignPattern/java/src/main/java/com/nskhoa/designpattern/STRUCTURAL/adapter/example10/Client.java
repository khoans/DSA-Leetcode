package com.nskhoa.designpattern.STRUCTURAL.adapter.example10;

public class Client {
    public static void main(String[] args) {
        UIComponent swingButton = new SwingButtonAdapter();
        UIComponent fxButton = new JavaFXButtonAdapter();

        swingButton.render();
        fxButton.render();
    }
}
