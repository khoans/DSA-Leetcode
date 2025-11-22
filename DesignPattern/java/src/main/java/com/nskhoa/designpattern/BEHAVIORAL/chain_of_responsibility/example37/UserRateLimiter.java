package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

// Concrete Handlers
public class UserRateLimiter extends RateLimiter {
    @Override
    public void check(Request request) {
        if ("user".equals(request.getUserRole())) {
            System.out.println("User rate limiting applied.");
        }
        else if (nextLimiter != null) {
            nextLimiter.check(request);
        }
        else {
            System.out.println("Request allowed.");
        }
    }
}
