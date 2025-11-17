package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public class LeastConnectionsFactory implements LoadBalancerAbstractFactory {
    public Distributor createDistributor() {
        return new LeastConnectionsDistributor();
    }

    public HealthChecker createHealthChecker() {
        return new LeastConnectionsHealthChecker();
    }
}
