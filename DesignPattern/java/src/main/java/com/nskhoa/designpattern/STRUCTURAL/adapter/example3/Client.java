package com.nskhoa.designpattern.STRUCTURAL.adapter.example3;


public class Client {
    public static void main(String[] args) {
        NewSystem adaptedSystem = new LegacyAdapter();
        System.out.println("Data from adapted legacy system: " + adaptedSystem.getData());
    }
}
