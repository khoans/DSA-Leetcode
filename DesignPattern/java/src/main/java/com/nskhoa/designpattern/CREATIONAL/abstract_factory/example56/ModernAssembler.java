package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example56;

public class ModernAssembler implements Assembler {
    public void assemble(String part) {
        System.out.println("Modern Assembled: " + part);
    }
}
