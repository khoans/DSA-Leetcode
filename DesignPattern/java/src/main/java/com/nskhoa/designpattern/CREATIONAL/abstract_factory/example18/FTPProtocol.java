package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class FTPProtocol implements Protocol {
    public void send(String data) {
        System.out.println("FTP Sent: " + data);
    }
}
