package com.nskhoa.sorting_algo.quick_sort;

public class QuickSortPractice {

    static void sort(int[] arr) {

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,
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
                1,
                5
        };
        sort(arr);
        printArray(arr);

//        int pivot = partition(arr, 0, arr.length-1);
//        System.out.println(pivot);
    }

}
