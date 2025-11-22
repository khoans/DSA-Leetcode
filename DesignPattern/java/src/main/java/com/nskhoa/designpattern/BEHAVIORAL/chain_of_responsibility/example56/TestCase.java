package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public class TestCase {
    private String name;
    boolean environmentSetup;
    boolean executed;
    private boolean reported;

    public TestCase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnvironmentSetup(boolean val) {
        environmentSetup = val;
    }

    public void setExecuted(boolean val) {
        executed = val;
    }

    public void setReported(boolean val) {
        reported = val;
    }
}
