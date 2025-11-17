package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public class RoundRobinDistributor implements Distributor {
    public String distribute(String request) {
        return "Round-Robin Instance";
    }
}
