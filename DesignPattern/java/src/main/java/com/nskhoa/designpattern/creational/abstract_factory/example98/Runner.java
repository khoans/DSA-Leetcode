package com.nskhoa.designpattern.creational.abstract_factory.example98;

import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.ServerlessAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.cloudfunctions.CloudFunctionsFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example98.factory.lambda.LambdaFactory;

public class Runner {
    public static void main(String[] args) {
        ServerlessAbstractFactory lambdaFactory = new LambdaFactory();
        var lambdaInvoker = lambdaFactory.createInvoker();
        var lambdaHandler = lambdaFactory.createHandler();
        lambdaInvoker.invoke("Lambda Function");
        lambdaHandler.handle("Lambda Event");

        ServerlessAbstractFactory cloudFunctionFactory = new CloudFunctionsFactory();
        var cloudInvoker = cloudFunctionFactory.createInvoker();
        var cloudHandler = cloudFunctionFactory.createHandler();
        cloudInvoker.invoke("Cloud Function");
        cloudHandler.handle("Cloud Event");
    }
}
