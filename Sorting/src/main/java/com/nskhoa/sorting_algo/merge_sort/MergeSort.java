package com.nskhoa.sorting_algo.merge_sort;

public class MergeSort {

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     * Uses "sentinel values" (Integer.MAX_VALUE) at the end of temporary arrays
     * to simplify comparison logic and avoid explicit boundary checks.
     *
     * @param arr    The full array containing the subarrays to merge
     * @param left   The starting index of the left subarray
     * @param middle The ending index of the left subarray (middle of original range)
     * @param right  The ending index of the right subarray
     */

    static void merge(int[] arr, int left, int middle, int right) {
        // Create temporary arrays to hold left and right halves
        int[] leftTempArr = new int[middle - left + 2];
        // intp[ rightTempArr = new int[right - (middle +1) +2];
        int[] rightTempArr = new int[right - middle + 1];

        int arrLeftLength = middle - left + 1;
        int arrRightLength = right - middle;

        // Copy values into the left temp array
        for (int i = 0; i < arrLeftLength; i++) {
            leftTempArr[i] = arr[left + i];
        }

        // Copy values into the right temp array
        for (int i = 0; i < arrRightLength; i++) {
            rightTempArr[i] = arr[middle + i + 1];
        }

        // Add sentinel values at the end of each temporary array
        leftTempArr[middle - left + 1] = Integer.MAX_VALUE;
        rightTempArr[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;

        // Merge left and right temporary arrays back into original array
        for (int k = left; k <= right; k++) {
            if (leftTempArr[i] < rightTempArr[j]) {
                arr[k] = leftTempArr[i];
                i++;
            }
            else {
                arr[k] = rightTempArr[j];
                j++;
            }
        }
    }

    /**
     * Recursively divides the array into two halves, sorts them,
     * then merges the sorted halves.
     *
     * @param arr   The array to sort
     * @param left  The starting index of the array/subarray
     * @param right The ending index of the array/subarray
     */
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Sort the left half
            mergeSort(arr, left, middle);

            // Sort the right half
            mergeSort(arr, middle + 1, right);

            // Merge both sorted halves
            merge(arr, left, middle, right);
        }
    }

    /**
     * Public method to sort an entire array using Merge Sort.
     *
     * @param arr The array to sort
     */
    static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // Already sorted or invalid input
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 9, 1, 3, 10, 2, 9, 5, 6, 5, 3, 1};

        sort(arr);
        printArray(arr);
    }
}
