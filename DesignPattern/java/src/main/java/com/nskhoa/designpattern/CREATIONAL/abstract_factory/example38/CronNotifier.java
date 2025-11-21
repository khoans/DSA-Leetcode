package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class CronNotifier implements Notifier {
    public void notify(String event) {
        System.out.println("Cron Notified: " + event);
    }
}
