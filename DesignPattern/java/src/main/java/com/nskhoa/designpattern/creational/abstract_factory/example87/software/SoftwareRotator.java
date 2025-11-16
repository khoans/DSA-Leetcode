package com.nskhoa.designpattern.creational.abstract_factory.example87.software;

import com.nskhoa.designpattern.creational.abstract_factory.example87.Rotator;

public class SoftwareRotator implements Rotator {
    public void rotate(String oldKey) {
        System.out.println("Software Rotated from " + oldKey);
    }
}
