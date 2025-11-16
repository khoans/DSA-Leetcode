package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.firewall;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Blocker;

public class FirewallBlocker implements Blocker {
    public void block(String ip) {
        System.out.println("Firewall Blocked: " + ip);
    }
}
