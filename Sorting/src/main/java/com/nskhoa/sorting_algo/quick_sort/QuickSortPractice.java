package com.nskhoa.sorting_algo.quick_sort;

public class QuickSortPractice {

    public static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start -1;
        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return i;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
        int pivot = partition(arr,start,end);

        quickSort(arr, start, pivot -1);
        quickSort(arr, pivot+1, end);
}
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <2) {
            return;
        }

        quickSort(arr, 0, arr.length -1);

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
