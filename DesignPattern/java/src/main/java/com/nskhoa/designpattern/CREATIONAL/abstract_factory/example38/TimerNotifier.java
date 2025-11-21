package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example38;

public class TimerNotifier implements Notifier {
    public void notify(String event) {
        System.out.println("Timer Notified: " + event);
    }
}
