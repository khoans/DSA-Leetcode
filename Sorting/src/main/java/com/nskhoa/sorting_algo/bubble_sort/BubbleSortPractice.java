package com.nskhoa.sorting_algo.bubble_sort;

public class BubbleSortPractice {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n -i -1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
                1};

        bubbleSort(arr);
        printArray(arr);
    }
}
