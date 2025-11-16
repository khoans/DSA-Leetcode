package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.intrusion;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Blocker;

public class IntrusionBlocker implements Blocker {
    public void block(String ip) {
        System.out.println("Intrusion Blocked: " + ip);
    }
}
