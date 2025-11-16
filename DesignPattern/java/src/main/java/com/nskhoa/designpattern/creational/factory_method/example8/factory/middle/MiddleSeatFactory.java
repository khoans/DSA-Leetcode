package com.nskhoa.designpattern.creational.factory_method.example8.factory.middle;

import com.nskhoa.designpattern.creational.factory_method.example8.factory.Seat;
import com.nskhoa.designpattern.creational.factory_method.example8.factory.SeatFactory;

public class MiddleSeatFactory extends SeatFactory {
    @Override
    public Seat createSeat() {
        return new MiddleSeat();
    }
}
