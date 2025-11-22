package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

// Client runner
public class APIRateLimitingDemo {
    public static void main(String[] args) {
        RateLimiter userLimiter = new UserRateLimiter();
        RateLimiter adminLimiter = new AdminRateLimiter();
        RateLimiter defaultLimiter = new DefaultRateLimiter();

        userLimiter.setNextLimiter(adminLimiter);
        adminLimiter.setNextLimiter(defaultLimiter);

        Request req1 = new Request("user", "GET");
        Request req2 = new Request("admin", "POST");
        Request req3 = new Request("guest", "GET");

        userLimiter.check(req1);
        userLimiter.check(req2);
        userLimiter.check(req3);
    }
}

