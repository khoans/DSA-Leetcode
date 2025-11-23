package com.nskhoa.designpattern.BEHAVIORAL.iterator.example11;

public class Grid {
    private final Cell[][] cells;
    private final int rows, cols;

    Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c] = new Cell(r, c, "");
            }
        }
    }

    void setValue(int row, int col, String val) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            cells[row][col] = new Cell(row, col, val);
        }
    }

    MyIterator<Cell> createIterator() {
        return new GridIterator();
    }

    private class GridIterator implements MyIterator<Cell> {
        private int currentRow = 0;
        private int currentCol = 0;

        public boolean hasNext() {
            return currentRow < rows && currentCol < cols;
        }

        public Cell next() {
            Cell cell = cells[currentRow][currentCol];
            if (currentCol < cols - 1) {
                currentCol++;
            }
            else {
                currentCol = 0;
                currentRow++;
            }
            return cell;
        }
    }
}
