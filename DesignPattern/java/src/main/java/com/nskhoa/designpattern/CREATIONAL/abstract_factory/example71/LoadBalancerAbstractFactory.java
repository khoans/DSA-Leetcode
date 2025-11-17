package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public interface LoadBalancerAbstractFactory {
    Distributor createDistributor();

    HealthChecker createHealthChecker();
}

