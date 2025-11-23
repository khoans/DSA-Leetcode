package com.nskhoa.designpattern.BEHAVIORAL.iterator.example30;

public class GameLevel {
    private final int levelNumber;
    private final String description;

    GameLevel(int levelNumber, String description) {
        this.levelNumber = levelNumber;
        this.description = description;
    }

    int getLevelNumber() {
        return levelNumber;
    }

    String getDescription() {
        return description;
    }
}
