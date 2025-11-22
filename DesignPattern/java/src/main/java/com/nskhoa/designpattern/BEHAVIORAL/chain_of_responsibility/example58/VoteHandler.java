package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public abstract class VoteHandler {
    protected VoteHandler nextHandler;

    public void setNextHandler(VoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Vote vote);
}
