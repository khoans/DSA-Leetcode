package com.nskhoa.designpattern.BEHAVIORAL.iterator.example30;

public class GameLevelDemo {
    public static void main(String[] args) {
        Game game = new Game();
        game.addLevel(new GameLevel(1, "Tutorial"));
        game.addLevel(new GameLevel(2, "Forest"));

        MyIterator<GameLevel> it = game.createIterator();
        while (it.hasNext()) {
            GameLevel level = it.next();
            System.out.println("Level " + level.getLevelNumber() + ": " + level.getDescription());
        }
    }
}
