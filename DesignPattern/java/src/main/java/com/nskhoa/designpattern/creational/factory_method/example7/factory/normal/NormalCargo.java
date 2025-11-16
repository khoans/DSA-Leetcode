package com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.normal;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.Cargo;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.CargoFactory;

public class NormalCargo extends CargoFactory {
    public Cargo createCargo() {
        return new Normal();
    }
}
