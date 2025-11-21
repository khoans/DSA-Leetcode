package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class FixedFactory implements ThreadPoolAbstractFactory {
    public Executor createExecutor() {
        return new FixedExecutor();
    }

    public Scheduler createScheduler() {
        return new FixedScheduler();
    }
}
