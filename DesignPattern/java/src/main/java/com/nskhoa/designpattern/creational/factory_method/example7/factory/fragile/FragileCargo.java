package com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.fragile;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.Cargo;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example7.factory.CargoFactory;

public class FragileCargo extends CargoFactory {
    public Cargo createCargo() {
        return new Fragile();
    }
}
