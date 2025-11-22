package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

// Abstract Handler
public abstract class UIComponent {
    protected UIComponent nextComponent;

    public void setNextComponent(UIComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

    public abstract void handleEvent(UIEvent event);
}
