package com.nskhoa.designpattern.CREATIONAL.factory_method.example2;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.Bus;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.BusRoute;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.ac.ACBusRoute;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.normal.NormalBusRoute;

public class Runner {
    public static void main(String[] args) {
        BusRoute acBusRoute = new ACBusRoute();
        Bus acBus = acBusRoute.createBus();
        acBus.getType();

        BusRoute normalBusRoute = new NormalBusRoute();
        Bus normalBus = normalBusRoute.createBus();
        normalBus.getType();
    }
}

