package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.intrusion;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example90.Monitor;

public class IntrusionMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}
