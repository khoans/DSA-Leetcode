package com.nskhoa.designpattern.STRUCTURAL.bridge.example15;

public abstract class Robot {
    protected RobotController controller;

    protected Robot(RobotController controller) {
        this.controller = controller;
    }

    abstract void navigate();
}
