package com.nskhoa.designpattern.creational.factory_method.example8;

import com.nskhoa.designpattern.creational.factory_method.example8.factory.Seat;
import com.nskhoa.designpattern.creational.factory_method.example8.factory.SeatFactory;
import com.nskhoa.designpattern.creational.factory_method.example8.factory.back.BackSeatFactory;
import com.nskhoa.designpattern.creational.factory_method.example8.factory.front.FrontSeatFactory;
import com.nskhoa.designpattern.creational.factory_method.example8.factory.middle.MiddleSeatFactory;

public class Runner {
    public static void main(String[] args) {
        SeatFactory frontSeatFactory = new FrontSeatFactory();
        Seat frontSeat = frontSeatFactory.createSeat();
        frontSeat.info();


        SeatFactory backSeatFactory = new BackSeatFactory();
        Seat backSeat = backSeatFactory.createSeat();
        backSeat.info();

        SeatFactory middleSeatFactory = new MiddleSeatFactory();
        Seat middleSeat = middleSeatFactory.createSeat();
        middleSeat.info();
    }
}
