package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class CronScheduler implements Scheduler {
    public void schedule(String task) {
        System.out.println("Cron Scheduled: " + task);
    }
}
