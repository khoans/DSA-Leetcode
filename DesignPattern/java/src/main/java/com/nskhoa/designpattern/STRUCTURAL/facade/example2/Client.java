package com.nskhoa.designpattern.STRUCTURAL.facade.example2;

class Light {
    void turnOn() { System.out.println("Lights ON"); }
    void turnOff() { System.out.println("Lights OFF"); }
}

class Thermostat {
    void setTemperature(int temp) { System.out.println("Setting temp to " + temp); }
}

class SecuritySystem {
    void arm() { System.out.println("Security armed"); }
    void disarm() { System.out.println("Security disarmed"); }
}

class HomeAutomationFacade {
    private Light light = new Light();
    private Thermostat thermostat = new Thermostat();
    private SecuritySystem security = new SecuritySystem();

    void leaveHome() {
        light.turnOff();
        thermostat.setTemperature(18);
        security.arm();
    }

    void arriveHome() {
        security.disarm();
        light.turnOn();
        thermostat.setTemperature(22);
    }
}

public class Client {
    public static void main(String[] args) {
        HomeAutomationFacade homeFacade = new HomeAutomationFacade();
        homeFacade.leaveHome();
        System.out.println("...time passes...");
        homeFacade.arriveHome();
    }
}
