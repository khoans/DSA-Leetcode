package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

// Request class
public class Command {
    private String commandName;

    public Command(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
