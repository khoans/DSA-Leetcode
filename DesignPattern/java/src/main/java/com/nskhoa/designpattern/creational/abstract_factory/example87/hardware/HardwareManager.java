package com.nskhoa.designpattern.creational.abstract_factory.example87.hardware;

import com.nskhoa.designpattern.creational.abstract_factory.example87.Manager;

public class HardwareManager implements Manager {
    public String storeKey(String key) {
        return "Hardware Stored: " + key;
    }
}
