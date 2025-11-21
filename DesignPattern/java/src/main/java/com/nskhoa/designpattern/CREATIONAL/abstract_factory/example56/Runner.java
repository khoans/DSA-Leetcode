package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example56;

// Usage: FurnitureAbstractFactory factory = new ModernFactory(); Part part = factory.createPart(); System.out.println(part.getMaterial());

public class Runner {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = new ModernFactory();
        Part part = factory.createPart();
        Assembler assembler = factory.createAssembler();
        System.out.println("Part Material: " + part.getMaterial());
        assembler.assemble(part.getMaterial());
    }
}
