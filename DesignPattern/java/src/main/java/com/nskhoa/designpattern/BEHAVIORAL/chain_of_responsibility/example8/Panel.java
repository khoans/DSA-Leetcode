package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

public class Panel extends UIComponent {
    private final String name = "Panel";

    @Override
    public void handleEvent(UIEvent event) {
        System.out.println("Panel received event: " + event.getType());
        if (event
                .getTargetName()
                .equals(name)) {
            System.out.println("Panel consumed the event.");
        }
        else if (nextComponent != null) {
            nextComponent.handleEvent(event);
        }
    }
}
