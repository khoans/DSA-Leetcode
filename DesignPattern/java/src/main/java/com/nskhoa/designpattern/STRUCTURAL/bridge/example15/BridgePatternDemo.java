package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Robot wheeledServiceRobot = new ServiceRobot(new WheeledRobotController());
        wheeledServiceRobot.navigate();

        Robot humanoidIndustrialRobot = new IndustrialRobot(new HumanoidRobotController());
        humanoidIndustrialRobot.navigate();
    }
}
