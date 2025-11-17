package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example3;

public class Runner {
    public static void main(String[] args) {
        ToolFactory professionalFactory = new ProfessionalFactory();
        Wrench proWrench = professionalFactory.createWrench();
        Screwdriver proScrewdriver = professionalFactory.createScrewdriver();
        System.out.println("Professional Tools: " + proWrench.getType() + " Wrench, " + proScrewdriver.getType() + " Screwdriver");

        ToolFactory homeFactory = new HomeFactory();
        Wrench homeWrench = homeFactory.createWrench();
        Screwdriver homeScrewdriver = homeFactory.createScrewdriver();
        System.out.println("Home Tools: " + homeWrench.getType() + " Wrench, " + homeScrewdriver.getType() + " Screwdriver");
    }
}
