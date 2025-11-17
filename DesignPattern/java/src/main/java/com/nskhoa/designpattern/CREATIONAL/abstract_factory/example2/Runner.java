package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example2;

public class Runner {
    public static void main(String[] args) {
        OutfitFactory sportFactory = new SportFactory();
        Shirt sportShirt = sportFactory.createShirt();
        Pants sportPants = sportFactory.createPants();
        System.out.println("Created a " + sportShirt.getType() + " shirt and " + sportPants.getType() + " pants.");

        OutfitFactory formalFactory = new FormalFactory();
        Shirt formalShirt = formalFactory.createShirt();
        Pants formalPants = formalFactory.createPants();
        System.out.println("Created a " + formalShirt.getType() + " shirt and " + formalPants.getType() + " pants.");
    }
}
