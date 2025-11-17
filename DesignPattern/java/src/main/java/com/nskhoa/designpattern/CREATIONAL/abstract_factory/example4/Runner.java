package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example4;

public class Runner {
    public static void main(String[] args) {
        BookFactory basicFactory = new BasicFactory();
        MathBook basicMath = basicFactory.createMathBook();
        PhysicsBook basicPhysics = basicFactory.createPhysicsBook();
        System.out.println("Basic Math Book Level: " + basicMath.getLevel());
        System.out.println("Basic Physics Book Level: " + basicPhysics.getLevel());

        BookFactory advancedFactory = new AdvancedFactory();
        MathBook advancedMath = advancedFactory.createMathBook();
        PhysicsBook advancedPhysics = advancedFactory.createPhysicsBook();
        System.out.println("Advanced Math Book Level: " + advancedMath.getLevel());
        System.out.println("Advanced Physics Book Level: " + advancedPhysics.getLevel());
    }
}
