package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public class RoundRobinFactory implements LoadBalancerAbstractFactory {
    public Distributor createDistributor() {
        return new RoundRobinDistributor();
    }

    public HealthChecker createHealthChecker() {
        return new RoundRobinHealthChecker();
    }
}
