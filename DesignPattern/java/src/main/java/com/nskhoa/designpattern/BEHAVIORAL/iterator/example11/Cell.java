package com.nskhoa.designpattern.BEHAVIORAL.iterator.example11;

public class Cell {
    private final int row, col;
    private final String value;

    Cell(int row, int col, String value) {
        this.row = row; this.col = col; this.value = value;
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }

    String getValue() {
        return value;
    }
}
