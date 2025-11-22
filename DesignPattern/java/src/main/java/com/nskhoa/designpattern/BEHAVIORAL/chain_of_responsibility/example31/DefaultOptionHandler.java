package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

public class DefaultOptionHandler extends CommandOptionHandler {
    @Override
    public void handle(CommandLineArgs args) {
        String current = args.current();
        if (current != null) {
            System.out.println("Unrecognized option: " + current);
            args.advance();
            if (nextHandler != null) {
                nextHandler.handle(args);
            }
        }
    }
}
