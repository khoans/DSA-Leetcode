package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

// Concrete Handlers
public class Button extends UIComponent {
    private final String name = "Button";

    @Override
    public void handleEvent(UIEvent event) {
        System.out.println("Button received event: " + event.getType());
        if (event
                .getTargetName()
                .equals(name)) {
            System.out.println("Button consumed the event.");
        }
        else if (nextComponent != null) {
            nextComponent.handleEvent(event);
        }
    }
}
