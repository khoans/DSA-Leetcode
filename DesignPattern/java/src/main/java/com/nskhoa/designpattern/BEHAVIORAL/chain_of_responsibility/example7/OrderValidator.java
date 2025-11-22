package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

// Abstract Handler
public abstract class OrderValidator {
    protected OrderValidator nextValidator;

    public void setNextValidator(OrderValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public abstract void validate(Order order);
}
