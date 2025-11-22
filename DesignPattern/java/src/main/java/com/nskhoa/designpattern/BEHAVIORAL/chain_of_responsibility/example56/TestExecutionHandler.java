package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public class TestExecutionHandler extends TestHandler {
    @Override
    public void handle(TestCase testCase) {
        if (testCase.environmentSetup) {
            System.out.println("Executing test: " + testCase.getName());
            testCase.setExecuted(true);
            if (nextHandler != null) {
                nextHandler.handle(testCase);
            }
        }
        else {
            System.out.println("Environment not set up. Cannot execute test: " + testCase.getName());
        }
    }
}
