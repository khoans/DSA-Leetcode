package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public abstract class AutomationHandler {
    protected AutomationHandler nextHandler;

    public void setNextHandler(AutomationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Command command);
}
