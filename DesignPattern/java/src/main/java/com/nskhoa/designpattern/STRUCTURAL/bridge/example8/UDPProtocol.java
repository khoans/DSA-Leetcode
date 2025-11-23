package com.nskhoa.designpattern.STRUCTURAL.bridge.example8;

public class UDPProtocol implements NetworkProtocol {
    public void send(String data) {
        System.out.println("Sending via UDP: " + data);
    }
}
