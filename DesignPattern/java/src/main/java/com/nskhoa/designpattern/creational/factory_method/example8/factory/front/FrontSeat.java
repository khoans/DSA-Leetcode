package com.nskhoa.designpattern.creational.factory_method.example8.factory.front;

import com.nskhoa.designpattern.creational.factory_method.example8.factory.Seat;

public class FrontSeat implements Seat {
    @Override
    public void info() {
        System.out.println("This is a front seat.");
    }
}
