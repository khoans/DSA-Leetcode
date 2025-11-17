package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example16;

public class OrcFactory implements KingdomAbstractFactory {
    public Army createArmy() {
        return new OrcArmy();
    }

    public Castle createCastle() {
        return new OrcCastle();
    }
}
