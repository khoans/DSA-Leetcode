package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.http.HTTPFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.syn.SYNFactory;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== DDoS Protection Abstract Factory Pattern Demo ===\n");

        // Simulate SYN flood attack detection and mitigation
        System.out.println("--- SYN Flood Protection ---");
        DDoSProtectionAbstractFactory synFactory = new SYNFactory();
        protectAgainstAttack(synFactory, "SYN flood detected from 192.168.1.100", "SYN Flood Attack");

        System.out.println();

        // Simulate HTTP flood attack detection and mitigation
        System.out.println("--- HTTP Flood Protection ---");
        DDoSProtectionAbstractFactory httpFactory = new HTTPFactory();
        protectAgainstAttack(httpFactory, "HTTP GET flood detected from multiple IPs", "HTTP Flood Attack");

        System.out.println();

        // Simulate normal traffic with SYN detector
        System.out.println("--- Normal Traffic Test (SYN Detector) ---");
        DDoSProtectionAbstractFactory synFactory2 = new SYNFactory();
        protectAgainstAttack(synFactory2, "Normal TCP traffic", "No attack detected");

        System.out.println("\n=== Demo Complete ===");
    }

    private static void protectAgainstAttack(DDoSProtectionAbstractFactory factory, String traffic, String attackType) {
        // Create detector and check for attack
        Detector detector = factory.createDetector();
        boolean isAttack = detector.detect(traffic);

        if (isAttack) {
            System.out.println("⚠ Attack detected!");
            // Create mitigator and mitigate the attack
            Mitigator mitigator = factory.createMitigator();
            mitigator.mitigate(attackType);
        } else {
            System.out.println("✓ No attack detected - Traffic is normal");
        }
    }
}

