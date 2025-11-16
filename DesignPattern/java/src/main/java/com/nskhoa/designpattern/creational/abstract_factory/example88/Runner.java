package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.hashicorp.HashiCorpFactory;

public class Runner {
    public static void main(String[] args) {
        SecretManagementAbstractFactory factory = new HashiCorpFactory();
        Vault vault = factory.createVault();
        Retriever retriever = factory.createRetriever();
        vault.store("db-password");
        retriever.retrieve("db-password");
    }
}
