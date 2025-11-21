package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class Runner {
    public static void main(String[] args) {
        AOPAbstractFactory factory = new LoggingFactory();
        Aspect aspect = factory.createAspect();
        Weaver weaver = factory.createWeaver();

        aspect.apply("userService.save");
        weaver.weave("userService.save code");
    }
}
