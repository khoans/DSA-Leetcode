package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

public class AdminRateLimiter extends RateLimiter {
    @Override
    public void check(Request request) {
        if ("admin".equals(request.getUserRole())) {
            System.out.println("Admin rate limiting applied.");
        }
        else if (nextLimiter != null) {
            nextLimiter.check(request);
        }
    }
}
