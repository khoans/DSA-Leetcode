package com.nskhoa.designpattern.creational.factory_method.example3;


import com.nskhoa.designpattern.creational.factory_method.example3.factory.Payment;
import com.nskhoa.designpattern.creational.factory_method.example3.factory.PaymentFactory;
import com.nskhoa.designpattern.creational.factory_method.example3.factory.card_payment.CardPaymentFactory;
import com.nskhoa.designpattern.creational.factory_method.example3.factory.cash_payment.CashPaymentFactory;

public class Runner {
    public static void main(String[] args) {
        PaymentFactory cardPaymentFactory = new CardPaymentFactory();
        Payment cardPayment = cardPaymentFactory.createPayment();
        cardPayment.getMethod();

        PaymentFactory cashPaymentFactory = new CashPaymentFactory();
        Payment cashPayment = cashPaymentFactory.createPayment();
        cashPayment.getMethod();

    }
}
