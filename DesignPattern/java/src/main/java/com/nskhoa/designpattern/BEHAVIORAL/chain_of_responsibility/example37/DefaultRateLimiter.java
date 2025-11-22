package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

public class DefaultRateLimiter extends RateLimiter {
    @Override
    public void check(Request request) {
        System.out.println("Default rate limiting applied.");
    }
}
