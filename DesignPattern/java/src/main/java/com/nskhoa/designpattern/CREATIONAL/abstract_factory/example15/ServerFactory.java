package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example15;

public class ServerFactory implements ComputerAbstractFactory {
    public RAM createRAM() {
        return new ServerRAM();
    }

    public CPU createCPU() {
        return new ServerCPU();
    }
}
