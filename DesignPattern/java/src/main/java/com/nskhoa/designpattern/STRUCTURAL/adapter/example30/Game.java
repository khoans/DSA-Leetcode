package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

public class Game {
    private final GameLevel[] levels = new GameLevel[10];
    private int count = 0;

    void addLevel(GameLevel level) {
        if (count < levels.length) {
            levels[count++] = level;
        }
    }

    MyIterator<GameLevel> createIterator() {
        return new LevelIterator();
    }

    private class LevelIterator implements MyIterator<GameLevel> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public GameLevel next() {
            return levels[index++];
        }
    }
}
