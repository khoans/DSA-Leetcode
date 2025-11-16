package com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.cash_payment;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example3.factory.Payment;

public class Cash implements Payment {
    public String getMethod() {
        return "Cash";
    }
}
