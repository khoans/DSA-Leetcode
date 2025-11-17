package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example15;

// Usage: ComputerAbstractFactory factory = new PCFactory(); RAM ram = factory.createRAM(); System.out.println(ram.getSize());
public class Runner {
    public static void main(String[] args) {
        ComputerAbstractFactory pcFactory = new PCFactory();
        RAM pcRam = pcFactory.createRAM();
        CPU pcCpu = pcFactory.createCPU();
        System.out.println("PC RAM: " + pcRam.getSize());
        System.out.println("PC CPU: " + pcCpu.getSpeed());

        ComputerAbstractFactory serverFactory = new ServerFactory();
        RAM serverRam = serverFactory.createRAM();
        CPU serverCpu = serverFactory.createCPU();
        System.out.println("Server RAM: " + serverRam.getSize());
        System.out.println("Server CPU: " + serverCpu.getSpeed());
    }
}
