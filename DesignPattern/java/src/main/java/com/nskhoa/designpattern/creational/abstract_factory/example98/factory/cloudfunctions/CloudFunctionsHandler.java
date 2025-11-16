package com.nskhoa.designpattern.creational.abstract_factory.example98.factory.cloudfunctions;

import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.Handler;

public class CloudFunctionsHandler implements Handler {
    public String handle(String event) {
        return "Cloud Functions Handled: " + event;
    }
}

