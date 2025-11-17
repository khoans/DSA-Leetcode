package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example3;

public class HomeFactory implements ToolFactory {
    public Wrench createWrench() {
        return new HomeWrench();
    }

    public Screwdriver createScrewdriver() {
        return new HomeScrewdriver();
    }
}
