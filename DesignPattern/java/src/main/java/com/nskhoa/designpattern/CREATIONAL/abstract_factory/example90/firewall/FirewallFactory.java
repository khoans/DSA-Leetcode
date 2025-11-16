package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.firewall;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Blocker;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Monitor;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.NetworkSecurityAbstractFactory;

public class FirewallFactory implements NetworkSecurityAbstractFactory {
    public Monitor createMonitor() {
        return new FirewallMonitor();
    }

    public Blocker createBlocker() {
        return new FirewallBlocker();
    }
}
