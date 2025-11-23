package com.nskhoa.designpattern.STRUCTURAL.bridge.example6;

public class Graphics2D implements Graphics {
    public void render(String content) {
        System.out.println("Rendering 2D: " + content);
    }
}
