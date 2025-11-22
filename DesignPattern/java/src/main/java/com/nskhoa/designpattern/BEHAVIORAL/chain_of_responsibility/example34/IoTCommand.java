package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

// Request class
public class IoTCommand {
    private String command;
    private boolean valid;

    public IoTCommand(String command, boolean valid) {
        this.command = command;
        this.valid = valid;
    }

    public String getCommand() {
        return command;
    }

    public boolean isValid() {
        return valid;
    }
}
