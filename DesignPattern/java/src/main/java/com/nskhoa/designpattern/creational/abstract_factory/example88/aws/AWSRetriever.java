package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.aws;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example88.Retriever;

public class AWSRetriever implements Retriever {
    public String retrieve(String id) {
        return "AWS Secret: " + id;
    }
}
