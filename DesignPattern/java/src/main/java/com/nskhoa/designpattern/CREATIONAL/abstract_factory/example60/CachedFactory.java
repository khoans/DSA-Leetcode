package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class CachedFactory implements ThreadPoolAbstractFactory {
    public Executor createExecutor() {
        return new CachedExecutor();
    }

    public Scheduler createScheduler() {
        return new CachedScheduler();
    }
}
