package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

public class PasteCommandHandler extends CommandHandler {
    @Override
    public void handle(Command command) {
        if ("paste".equalsIgnoreCase(command.getCommandName())) {
            System.out.println("Paste command executed.");
        }
        else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
