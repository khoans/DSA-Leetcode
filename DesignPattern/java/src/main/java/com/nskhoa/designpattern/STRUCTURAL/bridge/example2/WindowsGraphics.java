package com.nskhoa.designpattern.STRUCTURAL.bridge.example2;

public class WindowsGraphics implements GraphicsPlatform {
    public void drawWindow(String title) {
        System.out.println("Drawing window on Windows: " + title);
    }
}
