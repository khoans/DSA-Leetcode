package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example76;

public class CloudFrontDistributor implements Distributor {
    public String deliver(String content) {
        return "CloudFront Delivered: " + content;
    }
}
