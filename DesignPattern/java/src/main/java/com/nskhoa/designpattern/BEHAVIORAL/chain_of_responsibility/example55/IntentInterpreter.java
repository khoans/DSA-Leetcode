package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public class IntentInterpreter extends VirtualAssistantHandler {
    @Override
    public void handle(Command command) {
        System.out.println("Interpreting intent from command: " + command.getText());
        if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
