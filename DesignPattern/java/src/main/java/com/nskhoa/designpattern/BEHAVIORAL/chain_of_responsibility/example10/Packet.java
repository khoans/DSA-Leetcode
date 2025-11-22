package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

// Request class
public class Packet {
    private String sourceIp;
    private String destinationIp;

    public Packet(String sourceIp, String destinationIp) {
        this.sourceIp = sourceIp;
        this.destinationIp = destinationIp;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getDestinationIp() {
        return destinationIp;
    }
}
