package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

// Client runner
public class CommandLineParsingDemo {
    public static void main(String[] cliArgs) {
        CommandOptionHandler helpHandler = new HelpOptionHandler();
        CommandOptionHandler versionHandler = new VersionOptionHandler();
        CommandOptionHandler defaultHandler = new DefaultOptionHandler();

        helpHandler.setNextHandler(versionHandler);
        versionHandler.setNextHandler(defaultHandler);

        CommandLineArgs args = new CommandLineArgs(cliArgs);
        while (args.current() != null) {
            helpHandler.handle(args);
        }
    }
}
