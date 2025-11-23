package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public interface RateLimiter {
    boolean allowRequest(String clientId);
}
