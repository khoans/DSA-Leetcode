package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

// Abstract Handler
public abstract class AuthHandler {
    protected AuthHandler nextHandler;

    public void setNextHandler(AuthHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void authenticate(AuthRequest request);
}
