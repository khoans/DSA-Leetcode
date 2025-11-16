package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.ai;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.Notifier;

public class AINotifier implements Notifier {
    public void notify(String correlation) {
        System.out.println("AI Notified: " + correlation);
    }
}
