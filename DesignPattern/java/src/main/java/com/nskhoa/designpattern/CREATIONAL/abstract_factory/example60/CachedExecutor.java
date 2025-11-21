package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class CachedExecutor implements Executor {
    public void execute(Runnable task) {
        System.out.println("Cached Executed Task");
    }
}
