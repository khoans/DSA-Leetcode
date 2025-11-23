package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class CloudflareAdapter implements RateLimiter {
    private CloudflareLimiter cf = new CloudflareLimiter();
    public boolean allowRequest(String clientId) {
        return cf.cfAllow(clientId);
    }
}
