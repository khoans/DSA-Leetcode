package com.nskhoa.designpattern.STRUCTURAL.adapter.example10;

public class JavaFXButtonAdapter implements UIComponent {
    private JavaFXButton fxButton = new JavaFXButton();
    public void render() { fxButton.paintButton(); }
}
