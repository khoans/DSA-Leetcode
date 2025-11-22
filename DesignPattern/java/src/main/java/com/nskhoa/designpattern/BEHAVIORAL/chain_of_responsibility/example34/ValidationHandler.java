package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

// Concrete Handlers
public class ValidationHandler extends IoTCommandHandler {
    @Override
    public void handle(IoTCommand command) {
        if (command.isValid()) {
            System.out.println("Command validated.");
            if (nextHandler != null) {
                nextHandler.handle(command);
            }
        }
        else {
            System.out.println("Invalid command. Stopping.");
        }
    }
}
