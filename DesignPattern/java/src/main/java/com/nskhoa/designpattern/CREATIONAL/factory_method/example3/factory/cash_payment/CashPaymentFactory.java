package com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.cash_payment;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.Payment;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.PaymentFactory;

public class CashPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new Cash();
    }
}
