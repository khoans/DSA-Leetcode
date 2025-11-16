package com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.middle;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.Seat;

public class MiddleSeat implements Seat {
    @Override
    public void info() {
        System.out.println("This is a middle seat.");
    }
}
