package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public class RuleBasedAlertor implements Alertor {
    public void alert(String reason) {
        System.out.println("Rule Alert: " + reason);
    }
}
