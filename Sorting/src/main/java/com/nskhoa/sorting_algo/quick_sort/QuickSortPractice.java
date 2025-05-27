package com.nskhoa.sorting_algo.quick_sort;

public class QuickSortPractice {
    static void sort(int[] arr) {

    }


    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
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

        sort(arr);
        printArray(arr);
    }

}
