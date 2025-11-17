package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class EC2Compute implements Compute {
    public void execute(String task) {
        System.out.println("EC2 Executed: " + task);
    }
}
