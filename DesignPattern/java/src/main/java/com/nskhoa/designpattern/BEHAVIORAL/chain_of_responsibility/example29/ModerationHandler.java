package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

// Abstract Handler
public abstract class ModerationHandler {
    protected ModerationHandler nextHandler;

    public void setNextHandler(ModerationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void moderate(ChatMessage message);
}
