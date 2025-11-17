package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public class Runner {
    public static void main(String[] args) {
        LoadBalancerAbstractFactory factory = new RoundRobinFactory();
        Distributor distributor = factory.createDistributor();
        HealthChecker healthChecker = factory.createHealthChecker();

        String instance = distributor.distribute("Request1");
        System.out.println("Dispatched to: " + instance);
        System.out.println("Health Check: " + healthChecker.check(instance));
    }
}
