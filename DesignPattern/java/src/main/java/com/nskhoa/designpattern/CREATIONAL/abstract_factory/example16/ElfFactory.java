package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example16;

public class ElfFactory implements KingdomAbstractFactory {
    public Army createArmy() {
        return new ElfArmy();
    }

    public Castle createCastle() {
        return new ElfCastle();
    }
}
