package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

public class LoggingHandler extends IoTCommandHandler {
    @Override
    public void handle(IoTCommand command) {
        System.out.println("Command logged: " + command.getCommand());
        if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
