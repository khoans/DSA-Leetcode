package com.nskhoa.designpattern.STRUCTURAL.bridge.example6;

public abstract class Game {
    protected Graphics graphics;

    Game(Graphics graphics) {
        this.graphics = graphics;
    }

    abstract void play();
}
