package com.nskhoa.designpattern.STRUCTURAL.bridge.example3;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemoteControl(tv);
        remote.turnOn();
        remote.turnOff();

        Device radio = new Radio();
        remote = new BasicRemoteControl(radio);
        remote.turnOn();
        remote.turnOff();
    }
}
