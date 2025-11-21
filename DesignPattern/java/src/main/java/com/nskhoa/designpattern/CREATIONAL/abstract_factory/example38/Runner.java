package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

// Usage: SchedulerAbstractFactory factory = new CronFactory(); Scheduler sched = factory.createScheduler(); sched.schedule("backup");
public class Runner {
    public static void main(String[] args) {
        SchedulerAbstractFactory factory = new CronFactory();
        Scheduler scheduler = factory.createScheduler();
        Notifier notifier = factory.createNotifier();

        scheduler.schedule("Database Backup");
        notifier.notify("Backup Completed");
    }
}
