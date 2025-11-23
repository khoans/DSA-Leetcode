package com.nskhoa.designpattern.STRUCTURAL.adapter.example10;

public class SwingButtonAdapter implements UIComponent {
    private SwingButton swingButton = new SwingButton();
    public void render() { swingButton.drawButton(); }
}
