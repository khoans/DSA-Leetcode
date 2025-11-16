package com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.front;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.Seat;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example8.factory.SeatFactory;

public class FrontSeatFactory extends SeatFactory {
    @Override
    public Seat createSeat() {
        return new FrontSeat();
    }
}
