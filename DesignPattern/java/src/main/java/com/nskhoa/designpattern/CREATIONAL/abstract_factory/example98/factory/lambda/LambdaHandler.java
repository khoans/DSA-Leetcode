package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.lambda;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example98.factory.Handler;

public class LambdaHandler implements Handler {
    public String handle(String event) {
        return "Lambda Handled: " + event;
    }
}

