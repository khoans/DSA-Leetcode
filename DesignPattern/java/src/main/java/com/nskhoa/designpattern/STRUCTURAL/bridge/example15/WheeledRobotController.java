package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public class WheeledRobotController implements RobotController {
    public void moveForward() {
        System.out.println("Wheeled robot moving forward");
    }

    public void rotate() {
        System.out.println("Wheeled robot rotating");
    }
}
