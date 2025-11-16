package com.nskhoa.designpattern.creational.abstract_factory.example95.rule;

import com.nskhoa.designpattern.creational.abstract_factory.example95.Notifier;

public class RuleNotifier implements Notifier {
    public void notify(String correlation) {
        System.out.println("Rule Notified: " + correlation);
    }
}
