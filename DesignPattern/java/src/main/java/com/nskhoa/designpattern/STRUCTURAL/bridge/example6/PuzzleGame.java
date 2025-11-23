package com.nskhoa.designpattern.STRUCTURAL.bridge.example6;

public class PuzzleGame extends Game {
    PuzzleGame(Graphics graphics) {
        super(graphics);
    }

    public void play() {
        graphics.render("Puzzle Game Level");
    }
}
