package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public class IndustrialRobot extends Robot {
    public IndustrialRobot(RobotController controller) {
        super(controller);
    }

    public void navigate() {
        System.out.println("Industrial Robot navigation:");
        controller.moveForward();
        controller.rotate();
    }
}
