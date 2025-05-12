package com.nskhoa.DSA.data_structure.interfaces.array;

public interface ITwoDimensionArray
{
    // Inserting value in the Array
    void insertValueInTheArray(int row, int col, int value);

    // Accessing cell value from given array
    void accessCell(int row, int col);

    void traverse2DArray();

    // Searching a single value from the Array
    void searchingValue(int value);

    // Deleting a value from Array
    void deleteValuefromArray(int row, int col);
}
