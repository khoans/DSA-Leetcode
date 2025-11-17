package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example1;

public class Runner {
    public static void main(String[] args) {
        DinnerSetFactory factory = new ModernFactory();
        Plate plate = factory.createPlate();
        Fork fork = factory.createFork();
        System.out.println("Plate style: " + plate.getStyle());
        System.out.println("Fork style: " + fork.getStyle());

        factory = new ClassicFactory();
        plate = factory.createPlate();
        fork = factory.createFork();
        System.out.println("Plate style: " + plate.getStyle());
        System.out.println("Fork style: " + fork.getStyle());
    }
}
