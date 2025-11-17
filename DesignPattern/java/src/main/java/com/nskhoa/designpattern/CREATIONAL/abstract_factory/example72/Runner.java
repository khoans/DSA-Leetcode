package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example72;

public class Runner {
    public static void main(String[] args) {
        CircuitBreakerAbstractFactory factory = new SyncFactory();
        Breaker breaker = factory.createBreaker();
        Fallback fallback = factory.createFallback();

        String service = "UserService";
        if (breaker.allowCall(service)) {
            System.out.println("Calling " + service);
        }
        else {
            System.out.println(fallback.fallback(service));
        }
    }
}
