package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class EurekaRegistry implements Registry {
    public void register(String service) {
        System.out.println("Eureka Registered: " + service);
    }
}
