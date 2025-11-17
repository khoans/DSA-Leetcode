package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example70;

public class Runner {
    public static void main(String[] args) {
        DiscoveryAbstractFactory factory = new ConsulFactory();
        Registry registry = factory.createRegistry();
        Watcher watcher = factory.createWatcher();

        registry.register("UserService");
        System.out.println(watcher.discover("UserService"));

        factory = new EurekaFactory();
        registry = factory.createRegistry();
        watcher = factory.createWatcher();

        registry.register("OrderService");
        System.out.println(watcher.discover("OrderService"));
    }
}
