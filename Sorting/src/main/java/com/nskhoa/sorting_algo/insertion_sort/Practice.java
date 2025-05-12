package com.nskhoa.sorting_algo.insertion_sort;

public class Practice
{
	    static void insertionSort(int[] arr)
        {
        }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        printArray(arr);
    }
}
