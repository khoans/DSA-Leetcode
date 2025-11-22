package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example31;

// Request class
public class CommandLineArgs {
    private String[] args;
    private int index = 0;

    public CommandLineArgs(String[] args) {
        this.args = args;
    }

    public String current() {
        return (index < args.length)
               ? args[index]
               : null;
    }

    public void advance() {
        index++;
    }

    public int getIndex() {
        return index;
    }
}
