package com.nskhoa.designpattern.creational.abstract_factory.example90.firewall;

import com.nskhoa.designpattern.creational.abstract_factory.example90.Monitor;

public class FirewallMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}
