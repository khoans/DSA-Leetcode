package com.nskhoa.DSA.data_structure.interfaces.array;

public interface ISingleDimensionArray
{
    void insert(int location, int valueToBeInserted);

    void traverseArray();

    //Search for an element in the given Array
    void searchInArray(int valueToSearch);

    // Delete value from Array
    void deleteValue(int valueToDeleteIndex);
}
