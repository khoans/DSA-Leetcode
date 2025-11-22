package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

// Request class
public class SupportTicket {
    private int complexityLevel;

    public SupportTicket(int complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public int getComplexityLevel() {
        return complexityLevel;
    }
}
