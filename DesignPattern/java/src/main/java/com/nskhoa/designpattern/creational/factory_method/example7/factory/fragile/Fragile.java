package com.nskhoa.designpattern.creational.factory_method.example7.factory.fragile;

import com.nskhoa.designpattern.creational.factory_method.example7.factory.Cargo;

public class Fragile implements Cargo {
    public String getType() {
        return "Fragile";
    }
}
