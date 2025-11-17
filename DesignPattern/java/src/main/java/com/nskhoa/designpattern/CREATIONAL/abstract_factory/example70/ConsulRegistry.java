package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class ConsulRegistry implements Registry {
    public void register(String service) {
        System.out.println("Consul Registered: " + service);
    }
}
