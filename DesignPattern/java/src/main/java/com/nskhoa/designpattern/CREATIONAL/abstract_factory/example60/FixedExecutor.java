package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class FixedExecutor implements Executor {
    public void execute(Runnable task) {
        System.out.println("Fixed Executed Task");
    }
}
