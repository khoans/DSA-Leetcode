package com.nskhoa.designpattern.creational.abstract_factory.example88.aws;

import com.nskhoa.designpattern.creational.abstract_factory.example88.Vault;

public class AWSVault implements Vault {
    public void store(String secret) {
        System.out.println("AWS Stored: " + secret);
    }
}
