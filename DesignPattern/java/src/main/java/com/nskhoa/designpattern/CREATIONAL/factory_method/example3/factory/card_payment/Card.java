package com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.card_payment;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.Payment;

public class Card implements Payment {
    public String getMethod() {
        return "Card";
    }
}
