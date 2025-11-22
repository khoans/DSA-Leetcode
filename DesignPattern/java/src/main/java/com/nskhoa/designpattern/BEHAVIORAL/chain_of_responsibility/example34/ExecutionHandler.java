package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

public class ExecutionHandler extends IoTCommandHandler {
    @Override
    public void handle(IoTCommand command) {
        System.out.println("Executing command: " + command.getCommand());
    }
}
