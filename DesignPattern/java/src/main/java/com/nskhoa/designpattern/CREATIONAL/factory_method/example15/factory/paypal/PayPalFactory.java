package com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.paypal;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentProcessor;

public class PayPalFactory extends PaymentFactory {
    public PaymentProcessor createProcessor() { return new PayPalProcessor(); }
}
