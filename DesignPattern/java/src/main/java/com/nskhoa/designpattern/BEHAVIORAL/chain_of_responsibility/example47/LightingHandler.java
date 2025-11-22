package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public class LightingHandler extends AutomationHandler {
    @Override
    public void handle(Command command) {
        if ("lighting".equalsIgnoreCase(command.getType())) {
            System.out.println("LightingHandler executing: " + command.getAction());
        }
        else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
