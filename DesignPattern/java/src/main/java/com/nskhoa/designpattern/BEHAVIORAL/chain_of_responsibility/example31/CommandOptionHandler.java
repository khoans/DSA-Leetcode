package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

// Abstract Handler
public abstract class CommandOptionHandler {
    protected CommandOptionHandler nextHandler;

    public void setNextHandler(CommandOptionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(CommandLineArgs args);
}
