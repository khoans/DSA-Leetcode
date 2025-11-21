package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class TimerScheduler implements Scheduler {
    public void schedule(String task) {
        System.out.println("Timer Scheduled: " + task);
    }
}
