package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example87;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example87.hardware.HardwareFactory;

public class Runner {
    public static void main(String[] args) {
        KeyManagementAbstractFactory factory = new HardwareFactory();
        Manager manager = factory.createManager();
        Rotator rotator = factory.createRotator();
        String keyId = manager.storeKey("key123");
        rotator.rotate(keyId);

    }
}
