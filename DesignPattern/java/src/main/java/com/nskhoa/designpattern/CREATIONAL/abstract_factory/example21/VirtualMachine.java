package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class VirtualMachine implements Compute {
    public void execute(String task) {
        System.out.println("VM Executed: " + task);
    }
}
