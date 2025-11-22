package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

public class VersionOptionHandler extends CommandOptionHandler {
    @Override
    public void handle(CommandLineArgs args) {
        String current = args.current();
        if ("--version".equals(current) || "-v".equals(current)) {
            System.out.println("Version 1.0.0");
            args.advance();
        }
        else if (nextHandler != null) {
            nextHandler.handle(args);
        }
    }
}
