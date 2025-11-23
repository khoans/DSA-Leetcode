package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public class HumanoidRobotController implements RobotController {
    public void moveForward() {
        System.out.println("Humanoid robot walking forward");
    }

    public void rotate() {
        System.out.println("Humanoid robot turning");
    }
}
