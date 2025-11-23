package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class CloudflareLimiter {
    boolean cfAllow(String id) {
        System.out.println("Cloudflare allowing: " + id);
        return true;
    }
}
