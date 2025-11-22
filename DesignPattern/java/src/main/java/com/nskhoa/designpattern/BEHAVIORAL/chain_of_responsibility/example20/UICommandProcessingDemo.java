package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

// Client runner
public class UICommandProcessingDemo {
    public static void main(String[] args) {
        CommandHandler copyHandler = new CopyCommandHandler();
        CommandHandler pasteHandler = new PasteCommandHandler();
        CommandHandler defaultHandler = new DefaultCommandHandler();

        copyHandler.setNextHandler(pasteHandler);
        pasteHandler.setNextHandler(defaultHandler);

        Command cmd1 = new Command("copy");
        Command cmd2 = new Command("paste");
        Command cmd3 = new Command("cut");

        copyHandler.handle(cmd1);
        copyHandler.handle(cmd2);
        copyHandler.handle(cmd3);
    }
}

