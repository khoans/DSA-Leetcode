package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class AkamaiDistributor implements Distributor {
    public String deliver(String content) {
        return "Akamai Delivered: " + content;
    }
}
