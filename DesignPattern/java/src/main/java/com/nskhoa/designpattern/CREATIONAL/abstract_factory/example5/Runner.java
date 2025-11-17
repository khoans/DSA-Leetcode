package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example5;

public class Runner {
    public static void main(String[] args) {
        ToyFactory toyFactory = new FunFactory();
        Car funCar = toyFactory.createCar();
        Doll funDoll = toyFactory.createDoll();
        System.out.println("Created a " + funCar.getTheme() + " car and a " + funDoll.getTheme() + " doll.");

        toyFactory = new EduFactory();
        Car eduCar = toyFactory.createCar();
        Doll eduDoll = toyFactory.createDoll();
        System.out.println("Created a " + eduCar.getTheme() + " car and a " + eduDoll.getTheme() + " doll.");
    }
}
