package com.nskhoa.designpattern.STRUCTURAL.bridge.example6;

public class ActionGame extends Game {
    ActionGame(Graphics graphics) {
        super(graphics);
    }

    public void play() {
        graphics.render("Action Game Level");
    }
}
