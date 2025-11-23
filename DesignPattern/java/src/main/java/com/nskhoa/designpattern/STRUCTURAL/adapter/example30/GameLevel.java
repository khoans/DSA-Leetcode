package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

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
