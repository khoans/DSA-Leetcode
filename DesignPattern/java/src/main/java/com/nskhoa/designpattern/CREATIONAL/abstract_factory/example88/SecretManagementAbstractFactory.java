package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88;

public interface SecretManagementAbstractFactory {
    Vault createVault();

    Retriever createRetriever();
}
