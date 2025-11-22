package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public abstract class TestHandler {
    protected TestHandler nextHandler;

    public void setNextHandler(TestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(TestCase testCase);
}
