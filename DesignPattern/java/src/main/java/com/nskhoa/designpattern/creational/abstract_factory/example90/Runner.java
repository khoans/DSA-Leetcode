package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.intrusion.IntrusionFactory;

public class Runner {
    public static void main(String[] args) {
        NetworkSecurityAbstractFactory factory = new IntrusionFactory();
        Monitor monitor = factory.createMonitor();
        Blocker blocker = factory.createBlocker();
        boolean threat = monitor.detect("suspicious packet");
        blocker.block("suspicious packet");
    }
}
