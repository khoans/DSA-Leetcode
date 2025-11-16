package com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.back;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.Seat;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.SeatFactory;

public class BackSeatFactory extends SeatFactory {
    @Override
    public Seat createSeat() {
        return new BackSeat();
    }
}
