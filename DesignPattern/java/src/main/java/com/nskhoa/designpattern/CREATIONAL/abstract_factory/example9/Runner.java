package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example9;

public class Runner {
    public static void main(String[] args) {
        GardenFactory proFactory = new ProFactory();
        Shovel proShovel = proFactory.createShovel();
        Scissors proScissors = proFactory.createScissors();
        System.out.println("Pro Factory created: " + proShovel.getLevel() + " Shovel and " + proScissors.getLevel() + " Scissors");

        GardenFactory amateurFactory = new AmateurFactory();
        Shovel amateurShovel = amateurFactory.createShovel();
        Scissors amateurScissors = amateurFactory.createScissors();
        System.out.println("Amateur Factory created: " + amateurShovel.getLevel() + " Shovel and " + amateurScissors.getLevel() + " Scissors");
    }
}
