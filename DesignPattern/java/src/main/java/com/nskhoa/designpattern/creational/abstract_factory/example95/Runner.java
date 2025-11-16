package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.ai.AIFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example95.rule.RuleFactory;

public class Runner {
    public static void main(String[] args) {
        // Example 1: Using AI-based Event Correlation Factory
        System.out.println("=== AI-based Event Correlation ===");
        EventCorrelationAbstractFactory aiFactory = new AIFactory();
        processEvents(aiFactory, "NetworkDown", "ServerUnreachable");

        System.out.println();

        // Example 2: Using Rule-based Event Correlation Factory
        System.out.println("=== Rule-based Event Correlation ===");
        EventCorrelationAbstractFactory ruleFactory = new RuleFactory();
        processEvents(ruleFactory, "DiskFull", "ApplicationCrash");

        System.out.println();

        // Example 3: Demonstrating polymorphism - switching factories at runtime
        System.out.println("=== Runtime Factory Selection ===");
        String factoryType = "AI"; // This could come from configuration
        EventCorrelationAbstractFactory factory = getFactory(factoryType);
        processEvents(factory, "HighCPU", "SlowResponse");
    }

    private static void processEvents(EventCorrelationAbstractFactory factory, String event1, String event2) {
        // Create products using the factory
        Correlator correlator = factory.createCorrelator();
        Notifier notifier = factory.createNotifier();

        // Use the products
        System.out.println("Processing events: " + event1 + " and " + event2);
        boolean isCorrelated = correlator.correlate(event1, event2);

        if (isCorrelated) {
            String correlationMessage = event1 + " is correlated with " + event2;
            notifier.notify(correlationMessage);
        } else {
            System.out.println("No correlation found");
        }
    }

    private static EventCorrelationAbstractFactory getFactory(String type) {
        if ("AI".equalsIgnoreCase(type)) {
            return new AIFactory();
        } else if ("RULE".equalsIgnoreCase(type)) {
            return new RuleFactory();
        }
        throw new IllegalArgumentException("Unknown factory type: " + type);
    }
}
