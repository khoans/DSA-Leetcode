package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example71;

public class LeastConnectionsDistributor implements Distributor {
    public String distribute(String request) {
        return "Least Connections Instance";
    }
}
