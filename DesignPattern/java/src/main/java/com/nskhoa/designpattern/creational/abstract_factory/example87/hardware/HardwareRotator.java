package com.nskhoa.designpattern.creational.abstract_factory.example87.hardware;

import com.nskhoa.designpattern.creational.abstract_factory.example87.Rotator;

public class HardwareRotator implements Rotator {
    public void rotate(String oldKey) {
        System.out.println("Hardware Rotated from " + oldKey);
    }
}
