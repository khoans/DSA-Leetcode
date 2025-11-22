package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

public class Window extends UIComponent {
    private final String name = "Window";

    @Override
    public void handleEvent(UIEvent event) {
        System.out.println("Window received event: " + event.getType());
        if (event
                .getTargetName()
                .equals(name)) {
            System.out.println("Window consumed the event.");
        }
        else {
            System.out.println("Event unhandled.");
        }
    }
}
