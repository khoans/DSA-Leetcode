package com.nskhoa.designpattern.creational.abstract_factory.example88.hashicorp;

import com.nskhoa.designpattern.creational.abstract_factory.example88.Retriever;

public class HashiCorpRetriever implements Retriever {
    public String retrieve(String id) {
        return "HashiCorp Secret: " + id;
    }
}
