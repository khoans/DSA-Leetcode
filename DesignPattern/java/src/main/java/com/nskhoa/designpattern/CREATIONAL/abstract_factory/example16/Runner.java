package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example16;

public class Runner {
    public static void main(String[] args) {
        KingdomAbstractFactory elfFactory = new ElfFactory();
        Army elfArmy = elfFactory.createArmy();
        Castle elfCastle = elfFactory.createCastle();
        System.out.println(elfArmy.getDescription());
        System.out.println(elfCastle.getDescription());

        KingdomAbstractFactory orcFactory = new OrcFactory();
        Army orcArmy = orcFactory.createArmy();
        Castle orcCastle = orcFactory.createCastle();
        System.out.println(orcArmy.getDescription());
        System.out.println(orcCastle.getDescription());
    }
}
