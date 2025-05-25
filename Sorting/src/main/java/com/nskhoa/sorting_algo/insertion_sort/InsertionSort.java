package com.nskhoa.sorting_algo.insertion_sort;

public class InsertionSort
{

    // InsertionSort : traverse the array and compare each item with all the i tems on its left and find the
    // insertion index
    static void insertionSort(int[] arr)
    {
        // We leave the first item since it's already sorted
        for (int i = 1; i < arr.length; i++)
        {
            // We temporary store the item that we use to compare its left
            int temp = arr[i];
            // Track the index to insert the temp number
            int j = i;

            // the j index will keep decreasing till it finds the smallest number in the sorted section
            while (j > 0 && arr[j - 1] > temp)
            {
                // Since we are inserting, we need to shift the current sorted portion to the right
                arr[j] = arr[j - 1];
                j--; // Decreasing
            }
            arr[j] = temp;
        }
    }


    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {
                4,
                5,
                2,
                7,
                9,
                1,
                3,
                10,
                2,
                9,
                5,
                6,
                5,
                3,
                1
        };

        insertionSort(arr);
        printArray(arr);
    }
}
