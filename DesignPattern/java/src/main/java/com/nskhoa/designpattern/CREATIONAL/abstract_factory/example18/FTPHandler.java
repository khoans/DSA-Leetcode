package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class FTPHandler implements Handler {
    public void receive(String data) {
        System.out.println("FTP Received: " + data);
    }
}
