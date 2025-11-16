package com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.ac;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.Bus;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example2.factory.BusRoute;

public class ACBusRoute extends BusRoute {
    public Bus createBus() {
        return new ACBus();
    }
}
