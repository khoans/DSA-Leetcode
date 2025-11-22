package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public class Command {
    private String type;  // e.g., lighting, temperature, security
    private String action;

    public Command(String type, String action) {
        this.type = type;
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action;
    }
}
