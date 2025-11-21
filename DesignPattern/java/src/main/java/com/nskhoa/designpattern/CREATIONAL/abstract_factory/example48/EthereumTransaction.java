package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class EthereumTransaction implements Transaction {
    public void send(String to, double amount) {
        System.out.println("Ethereum Sent: " + to + " " + amount);
    }
}
