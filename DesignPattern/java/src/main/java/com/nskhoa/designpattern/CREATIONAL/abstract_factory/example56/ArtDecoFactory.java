package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example56;

public class ArtDecoFactory implements FurnitureAbstractFactory {
    public Part createPart() {
        return new ArtDecoPart();
    }

    public Assembler createAssembler() {
        return new ArtDecoAssembler();
    }
}
