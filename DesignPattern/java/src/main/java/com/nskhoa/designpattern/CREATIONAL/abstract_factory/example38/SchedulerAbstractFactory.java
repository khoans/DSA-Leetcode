package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public interface SchedulerAbstractFactory {
    Scheduler createScheduler();

    Notifier createNotifier();
}
