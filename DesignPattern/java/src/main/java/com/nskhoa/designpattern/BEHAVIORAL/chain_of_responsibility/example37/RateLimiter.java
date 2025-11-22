package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

// Abstract Handler
public abstract class RateLimiter {
    protected RateLimiter nextLimiter;

    public void setNextLimiter(RateLimiter nextLimiter) {
        this.nextLimiter = nextLimiter;
    }

    public abstract void check(Request request);
}
