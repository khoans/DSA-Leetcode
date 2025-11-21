package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example60;

public class Runner {
    public static void main(String[] args) {
        ThreadPoolAbstractFactory factory = new FixedFactory();
        Executor executor = factory.createExecutor();
        Scheduler scheduler = factory.createScheduler();

        executor.execute(() -> System.out.println("Running Task"));
        scheduler.schedule(() -> System.out.println("Scheduled Task"), 1000);
    }
}
