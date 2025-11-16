package com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.back;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.Seat;

public class BackSeat implements Seat {
    @Override
    public void info() {
        System.out.println("This is a back seat.");
    }
}
