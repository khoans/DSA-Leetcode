package com.nskhoa.designpattern.creational.factory_method.example2.factory.normal;

import com.nskhoa.designpattern.creational.factory_method.example2.factory.Bus;
import com.nskhoa.designpattern.creational.factory_method.example2.factory.BusRoute;

public class NormalBusRoute extends BusRoute {
    public Bus createBus() {
        return new NormalBus();
    }
}
