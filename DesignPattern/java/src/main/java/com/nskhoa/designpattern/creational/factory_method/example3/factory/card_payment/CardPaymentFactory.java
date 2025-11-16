package com.nskhoa.designpattern.creational.factory_method.example3.factory.card_payment;

import com.nskhoa.designpattern.creational.factory_method.example3.factory.Payment;
import com.nskhoa.designpattern.creational.factory_method.example3.factory.PaymentFactory;

public class CardPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new Card();
    }
}
