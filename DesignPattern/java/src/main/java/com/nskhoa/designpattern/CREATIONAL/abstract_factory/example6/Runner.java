package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example6;

public class Runner {
    public static void main(String[] args) {
        SpiceFactory organicFactory = new OrganicFactory();
        Salt organicSalt = organicFactory.createSalt();
        Pepper organicPepper = organicFactory.createPepper();
        System.out.println("Organic Salt Type: " + organicSalt.getType());
        System.out.println("Organic Pepper Type: " + organicPepper.getType());

        SpiceFactory regularFactory = new RegularFactory();
        Salt regularSalt = regularFactory.createSalt();
        Pepper regularPepper = regularFactory.createPepper();
        System.out.println("Regular Salt Type: " + regularSalt.getType());
        System.out.println("Regular Pepper Type: " + regularPepper.getType());
    }
}
