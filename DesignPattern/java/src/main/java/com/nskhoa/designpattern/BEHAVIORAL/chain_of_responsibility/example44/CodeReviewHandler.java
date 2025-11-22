package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example44;

public abstract class CodeReviewHandler {
    protected CodeReviewHandler nextHandler;

    public void setNextHandler(CodeReviewHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void review(CodeChange code);
}
