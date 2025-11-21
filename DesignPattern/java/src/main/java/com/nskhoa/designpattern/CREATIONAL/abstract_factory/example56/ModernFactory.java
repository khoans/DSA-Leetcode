package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example56;

public class ModernFactory implements FurnitureAbstractFactory {
    public Part createPart() {
        return new ModernPart();
    }

    public Assembler createAssembler() {
        return new ModernAssembler();
    }
}
