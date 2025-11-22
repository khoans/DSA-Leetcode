package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

public class DefaultCommandHandler extends CommandHandler {
    @Override
    public void handle(Command command) {
        System.out.println("Command " + command.getCommandName() + " not recognized.");
    }
}
