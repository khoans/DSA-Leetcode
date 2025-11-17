package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example16;

public interface KingdomAbstractFactory {
    Army createArmy();

    Castle createCastle();
}

// Usage: KingdomAbstractFactory factory = new ElfFactory(); Army army = factory.createArmy(); System.out.println(army.getDescription());

