package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

// Client Runner
public class UIEventHandlingDemo {
    public static void main(String[] args) {
        UIComponent button = new Button();
        UIComponent panel = new Panel();
        UIComponent window = new Window();

        button.setNextComponent(panel);
        panel.setNextComponent(window);

        UIEvent event1 = new UIEvent("Click", "Panel");
        UIEvent event2 = new UIEvent("Click", "Window");
        UIEvent event3 = new UIEvent("Click", "Button");

        System.out.println("Dispatching event1:");
        button.handleEvent(event1);

        System.out.println("\nDispatching event2:");
        button.handleEvent(event2);

        System.out.println("\nDispatching event3:");
        button.handleEvent(event3);
    }
}

