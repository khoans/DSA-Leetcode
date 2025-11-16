package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.intrusion;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Blocker;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Monitor;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.NetworkSecurityAbstractFactory;

public class IntrusionFactory implements NetworkSecurityAbstractFactory {
    public Monitor createMonitor() {
        return new IntrusionMonitor();
    }

    public Blocker createBlocker() {
        return new IntrusionBlocker();
    }
}
