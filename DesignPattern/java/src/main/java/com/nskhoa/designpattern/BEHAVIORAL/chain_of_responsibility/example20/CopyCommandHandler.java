package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

// Concrete Handlers
public class CopyCommandHandler extends CommandHandler {
    @Override
    public void handle(Command command) {
        if ("copy".equalsIgnoreCase(command.getCommandName())) {
            System.out.println("Copy command executed.");
        }
        else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
