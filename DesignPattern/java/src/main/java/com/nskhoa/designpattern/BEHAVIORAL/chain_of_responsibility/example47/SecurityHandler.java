package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public class SecurityHandler extends AutomationHandler {
    @Override
    public void handle(Command command) {
        if ("security".equalsIgnoreCase(command.getType())) {
            System.out.println("SecurityHandler executing: " + command.getAction());
        }
        else {
            System.out.println("No handler for command type: " + command.getType());
        }
    }
}
