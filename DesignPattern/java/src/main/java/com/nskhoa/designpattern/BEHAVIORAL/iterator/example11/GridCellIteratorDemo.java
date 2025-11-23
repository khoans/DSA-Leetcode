package com.nskhoa.designpattern.BEHAVIORAL.iterator.example11;

public class GridCellIteratorDemo {
    public static void main(String[] args) {
        Grid grid = new Grid(3, 3);
        grid.setValue(0, 0, "X");
        grid.setValue(1, 1, "O");
        MyIterator<Cell> it = grid.createIterator();

        while (it.hasNext()) {
            Cell cell = it.next();
            System.out.println("Cell[" + cell.getRow() + "," + cell.getCol() + "]: " + cell.getValue());
        }
    }
}

