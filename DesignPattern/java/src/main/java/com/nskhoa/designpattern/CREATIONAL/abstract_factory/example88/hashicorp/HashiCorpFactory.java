package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.hashicorp;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.Retriever;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.SecretManagementAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.Vault;

public class HashiCorpFactory implements SecretManagementAbstractFactory {
    public Vault createVault() {
        return new HashiCorpVault();
    }

    public Retriever createRetriever() {
        return new HashiCorpRetriever();
    }
}

