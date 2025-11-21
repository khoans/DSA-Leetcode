package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class TimerFactory implements SchedulerAbstractFactory {
    public Scheduler createScheduler() {
        return new TimerScheduler();
    }

    public Notifier createNotifier() {
        return new TimerNotifier();
    }
}
