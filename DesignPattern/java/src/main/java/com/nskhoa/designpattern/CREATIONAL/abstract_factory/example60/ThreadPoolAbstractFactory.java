package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public interface ThreadPoolAbstractFactory {
    Executor createExecutor();

    Scheduler createScheduler();
}

// Usage: ThreadPoolAbstractFactory factory = new FixedFactory(); Executor exec = factory.createExecutor(); exec.execute(() -> System.out.println("Run"));

