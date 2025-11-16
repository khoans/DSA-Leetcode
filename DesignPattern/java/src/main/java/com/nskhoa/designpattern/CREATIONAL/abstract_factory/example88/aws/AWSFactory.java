package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.aws;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.Retriever;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.SecretManagementAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.Vault;

public class AWSFactory implements SecretManagementAbstractFactory {
    public Vault createVault() {
        return new AWSVault();
    }

    public Retriever createRetriever() {
        return new AWSRetriever();
    }
}
