package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public class TestReportingHandler extends TestHandler {
    @Override
    public void handle(TestCase testCase) {
        if (testCase.executed) {
            System.out.println("Reporting results for test: " + testCase.getName());
            testCase.setReported(true);
        }
        else {
            System.out.println("Test not executed. Cannot report results for: " + testCase.getName());
        }
    }
}
