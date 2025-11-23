package com.nskhoa.designpattern.STRUCTURAL.bridge.example6;

public class BridgePatternExample6 {
    public static void main(String[] args) {
        Graphics graphics2D = new Graphics2D();
        Graphics graphics3D = new Graphics3D();

        Game puzzleGame2D = new PuzzleGame(graphics2D);
        Game puzzleGame3D = new PuzzleGame(graphics3D);

        Game actionGame2D = new ActionGame(graphics2D);
        Game actionGame3D = new ActionGame(graphics3D);

        puzzleGame2D.play();
        puzzleGame3D.play();
        actionGame2D.play();
        actionGame3D.play();
    }
}
