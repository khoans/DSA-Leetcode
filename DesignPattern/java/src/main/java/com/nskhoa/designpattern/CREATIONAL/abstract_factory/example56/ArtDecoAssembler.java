package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example56;

public class ArtDecoAssembler implements Assembler {
    public void assemble(String part) {
        System.out.println("Art Deco Assembled: " + part);
    }
}
