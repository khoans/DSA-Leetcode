package com.nskhoa.designpattern.STRUCTURAL.facade.example3;

class FlightBooking {
    void bookFlight() { System.out.println("Flight booked"); }
}

class HotelBooking {
    void bookHotel() { System.out.println("Hotel booked"); }
}

class CarRental {
    void rentCar() { System.out.println("Car rented"); }
}

class TravelFacade {
    private FlightBooking flight = new FlightBooking();
    private HotelBooking hotel = new HotelBooking();
    private CarRental carRental = new CarRental();

    void bookTravelPackage() {
        flight.bookFlight();
        hotel.bookHotel();
        carRental.rentCar();
        System.out.println("Full travel package booked!");
    }
}

public class Client {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.bookTravelPackage();
    }
}
