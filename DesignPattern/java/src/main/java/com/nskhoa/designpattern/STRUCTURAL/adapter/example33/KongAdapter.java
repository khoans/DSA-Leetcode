package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class KongAdapter implements RateLimiter {
    private KongLimiter kong = new KongLimiter();
    public boolean allowRequest(String clientId) {
        return kong.kongAllow(clientId);
    }
}
