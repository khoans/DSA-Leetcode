package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public class EnvironmentSetupHandler extends TestHandler {
    @Override
    public void handle(TestCase testCase) {
        System.out.println("Setting up environment for test: " + testCase.getName());
        testCase.setEnvironmentSetup(true);
        if (nextHandler != null) {
            nextHandler.handle(testCase);
        }
    }
}
