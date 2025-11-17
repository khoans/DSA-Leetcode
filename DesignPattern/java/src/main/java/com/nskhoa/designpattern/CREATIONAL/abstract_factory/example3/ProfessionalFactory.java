package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example3;

public class ProfessionalFactory implements ToolFactory {
    public Wrench createWrench() {
        return new ProWrench();
    }

    public Screwdriver createScrewdriver() {
        return new ProScrewdriver();
    }
}
