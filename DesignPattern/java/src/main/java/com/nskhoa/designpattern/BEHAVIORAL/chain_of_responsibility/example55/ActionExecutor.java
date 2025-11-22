package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public class ActionExecutor extends VirtualAssistantHandler {
    @Override
    public void handle(Command command) {
        System.out.println("Executing action for command: " + command.getText());
    }
}
