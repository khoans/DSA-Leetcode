package com.nskhoa.sorting_algo.merge_sort;

public class MergeSortPractice
{
    static void merge(int[] arr, int left, int middle, int right) {
    }

    static void mergeSort(int[] arr, int left, int right) {
    }

    static void sort(int[] arr) {
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

        sort(arr);
        printArray(arr);
    }
}
