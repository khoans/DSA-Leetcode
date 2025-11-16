package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example87.software;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example87.Manager;

public class SoftwareManager implements Manager {
    public String storeKey(String key) {
        return "Software Stored: " + key;
    }
}
