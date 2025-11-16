package com.nskhoa.designpattern.creational.abstract_factory.example88;

public interface SecretManagementAbstractFactory {
    Vault createVault();

    Retriever createRetriever();
}
