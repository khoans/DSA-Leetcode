package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.firewall;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Monitor;

public class FirewallMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}
