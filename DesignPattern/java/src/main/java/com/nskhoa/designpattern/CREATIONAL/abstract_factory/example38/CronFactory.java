package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class CronFactory implements SchedulerAbstractFactory {
    public Scheduler createScheduler() {
        return new CronScheduler();
    }

    public Notifier createNotifier() {
        return new CronNotifier();
    }
}
