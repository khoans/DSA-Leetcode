package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public class TemperatureHandler extends AutomationHandler {
    @Override
    public void handle(Command command) {
        if ("temperature".equalsIgnoreCase(command.getType())) {
            System.out.println("TemperatureHandler executing: " + command.getAction());
        }
        else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
