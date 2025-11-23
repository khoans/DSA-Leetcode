package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public class ServiceRobot extends Robot {
    public ServiceRobot(RobotController controller) {
        super(controller);
    }

    public void navigate() {
        System.out.println("Service Robot navigation:");
        controller.moveForward();
        controller.rotate();
    }
}
