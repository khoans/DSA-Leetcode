package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example15;

public class PCFactory implements ComputerAbstractFactory {
    public RAM createRAM() {
        return new PCRAM();
    }

    public CPU createCPU() {
        return new PCCPU();
    }
}
