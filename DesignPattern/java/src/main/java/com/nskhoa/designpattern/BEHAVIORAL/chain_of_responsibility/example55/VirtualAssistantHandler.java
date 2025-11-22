package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public abstract class VirtualAssistantHandler {
    protected VirtualAssistantHandler nextHandler;

    public void setNextHandler(VirtualAssistantHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Command command);
}
