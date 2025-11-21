package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class CachedScheduler implements Scheduler {
    public void schedule(Runnable task, long delay) {
        System.out.println("Cached Scheduled: " + delay);
    }
}
