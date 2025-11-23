package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class KongLimiter {
    boolean kongAllow(String id) {
        System.out.println("Kong allowing: " + id);
        return true;
    }
}
