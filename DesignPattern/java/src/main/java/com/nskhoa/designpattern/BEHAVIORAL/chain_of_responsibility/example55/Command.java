package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public class Command {
    private String text;

    public Command(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
