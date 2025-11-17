package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example4;

public class AdvancedFactory implements BookFactory {
    public MathBook createMathBook() {
        return new AdvancedMath();
    }

    public PhysicsBook createPhysicsBook() {
        return new AdvancedPhysics();
    }
}
