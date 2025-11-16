package com.nskhoa.designpattern.creational.abstract_factory.example90.intrusion;

import com.nskhoa.designpattern.creational.abstract_factory.example90.Monitor;

public class IntrusionMonitor implements Monitor {
    public boolean detect(String packet) {
        return false;
    }
}
