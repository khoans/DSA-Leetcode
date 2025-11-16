package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.owasp;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example91.Logger;

public class OWASPLogger implements Logger {
    public void log(String attack) {
        System.out.println("OWASP Logged: " + attack);
    }
}
