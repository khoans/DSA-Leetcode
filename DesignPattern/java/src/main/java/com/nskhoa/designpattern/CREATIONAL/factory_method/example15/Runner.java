package com.nskhoa.designpattern.CREATIONAL.factory_method.example15;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentProcessor;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.creditcard.CreditCardFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.paypal.PayPalFactory;

public class Runner {
    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardFactory();
        PaymentProcessor creditCardFactoryProcessor = creditCardFactory.createProcessor();
        creditCardFactoryProcessor.process(100.0);

        PaymentFactory paypalFactory = new PayPalFactory();
        PaymentProcessor paypalFactoryProcessor = paypalFactory.createProcessor();
        paypalFactoryProcessor.process(200.0);

    }
}
