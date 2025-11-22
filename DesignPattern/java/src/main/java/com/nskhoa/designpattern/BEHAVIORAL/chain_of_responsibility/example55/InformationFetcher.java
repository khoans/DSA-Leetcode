package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public class InformationFetcher extends VirtualAssistantHandler {
    @Override
    public void handle(Command command) {
        System.out.println("Fetching information for command: " + command.getText());
        if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
