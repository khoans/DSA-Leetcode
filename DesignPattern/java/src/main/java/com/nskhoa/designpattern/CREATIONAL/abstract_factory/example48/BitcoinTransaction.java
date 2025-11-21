package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class BitcoinTransaction implements Transaction {
    public void send(String to, double amount) {
        System.out.println("Bitcoin Sent: " + to + " " + amount);
    }
}
