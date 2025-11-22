package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example20;

// Abstract Handler
public abstract class CommandHandler {
    protected CommandHandler nextHandler;

    public void setNextHandler(CommandHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Command command);
}
