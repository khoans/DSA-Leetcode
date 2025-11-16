package com.nskhoa.designpattern.creational.factory_method.example15.factory.creditcard;

import com.nskhoa.designpattern.creational.factory_method.example15.factory.PaymentFactory;
import com.nskhoa.designpattern.creational.factory_method.example15.factory.PaymentProcessor;

public class CreditCardFactory extends PaymentFactory {
    public PaymentProcessor createProcessor() { return new CreditCardProcessor(); }
}
