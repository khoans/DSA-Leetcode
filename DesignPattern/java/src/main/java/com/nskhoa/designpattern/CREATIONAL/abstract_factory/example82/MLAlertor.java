package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example82;

public class MLAlertor implements Alertor {
    public void alert(String reason) {
        System.out.println("ML Alert: " + reason);
    }
}
