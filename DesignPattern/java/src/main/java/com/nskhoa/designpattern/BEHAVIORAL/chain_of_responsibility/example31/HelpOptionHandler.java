package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

// Concrete Handlers
public class HelpOptionHandler extends CommandOptionHandler {
    @Override
    public void handle(CommandLineArgs args) {
        String current = args.current();
        if ("--help".equals(current) || "-h".equals(current)) {
            System.out.println("Displaying help...");
            args.advance();
        }
        else if (nextHandler != null) {
            nextHandler.handle(args);
        }
    }
}
