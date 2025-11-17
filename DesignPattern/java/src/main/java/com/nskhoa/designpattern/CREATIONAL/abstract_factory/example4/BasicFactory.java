package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example4;

public class BasicFactory implements BookFactory {
    public MathBook createMathBook() {
        return new BasicMath();
    }

    public PhysicsBook createPhysicsBook() {
        return new BasicPhysics();
    }
}
