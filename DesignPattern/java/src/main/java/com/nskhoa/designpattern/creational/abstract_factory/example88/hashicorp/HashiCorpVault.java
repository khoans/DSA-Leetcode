package com.nskhoa.designpattern.creational.abstract_factory.example88.hashicorp;

import com.nskhoa.designpattern.creational.abstract_factory.example88.Vault;

public class HashiCorpVault implements Vault {
    public void store(String secret) {
        System.out.println("HashiCorp Stored: " + secret);
    }
}
