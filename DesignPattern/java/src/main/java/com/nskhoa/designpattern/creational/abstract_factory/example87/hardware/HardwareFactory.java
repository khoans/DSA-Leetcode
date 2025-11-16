package com.nskhoa.designpattern.creational.abstract_factory.example87.hardware;

import com.nskhoa.designpattern.creational.abstract_factory.example87.KeyManagementAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example87.Manager;
import com.nskhoa.designpattern.creational.abstract_factory.example87.Rotator;

public class HardwareFactory implements KeyManagementAbstractFactory {
    public Manager createManager() {
        return new HardwareManager();
    }

    public Rotator createRotator() {
        return new HardwareRotator();
    }
}

