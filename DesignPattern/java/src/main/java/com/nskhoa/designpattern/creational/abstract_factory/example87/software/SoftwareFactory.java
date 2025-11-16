package com.nskhoa.designpattern.creational.abstract_factory.example87.software;

import com.nskhoa.designpattern.creational.abstract_factory.example87.KeyManagementAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example87.Manager;
import com.nskhoa.designpattern.creational.abstract_factory.example87.Rotator;

public class SoftwareFactory implements KeyManagementAbstractFactory {
    public Manager createManager() {
        return new SoftwareManager();
    }

    public Rotator createRotator() {
        return new SoftwareRotator();
    }
}
