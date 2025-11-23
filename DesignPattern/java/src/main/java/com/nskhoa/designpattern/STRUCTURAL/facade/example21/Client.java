package com.nskhoa.designpattern.STRUCTURAL.facade.example21;

class CPU {
    void start() {
        System.out.println("CPU starting");
    }
}

class Memory {
    void load() {
        System.out.println("Memory loading");
    }
}

class HardDrive {
    void read() {
        System.out.println("Hard drive reading");
    }
}

class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started.");
    }
}

public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
