package com.nskhoa.designpattern.creational.factory_method.example7;

import com.nskhoa.designpattern.creational.factory_method.example7.factory.Cargo;
import com.nskhoa.designpattern.creational.factory_method.example7.factory.CargoFactory;
import com.nskhoa.designpattern.creational.factory_method.example7.factory.fragile.FragileCargo;
import com.nskhoa.designpattern.creational.factory_method.example7.factory.normal.NormalCargo;

public class Runner {
    public static void main(String[] args) {
        CargoFactory fragileCargoFactory = new FragileCargo();
        Cargo fragileCargo = fragileCargoFactory.createCargo();
        fragileCargo.getType();


        CargoFactory normalCargoFactory = new NormalCargo();
        Cargo normalCargo = normalCargoFactory.createCargo();
        normalCargo.getType();
    }
}
