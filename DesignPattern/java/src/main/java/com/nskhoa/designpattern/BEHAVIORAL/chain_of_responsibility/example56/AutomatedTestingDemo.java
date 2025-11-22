package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example56;

public class AutomatedTestingDemo {
    public static void main(String[] args) {
        TestHandler setup = new EnvironmentSetupHandler();
        TestHandler execute = new TestExecutionHandler();
        TestHandler report = new TestReportingHandler();

        setup.setNextHandler(execute);
        execute.setNextHandler(report);

        TestCase test = new TestCase("Login Test");
        setup.handle(test);
    }
}
