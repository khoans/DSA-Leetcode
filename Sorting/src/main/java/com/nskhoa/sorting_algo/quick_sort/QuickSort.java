package com.nskhoa.sorting_algo.quick_sort;

public class QuickSort {

    /**
     * Swap two elements in the array at indices i and j
     *
     * @param arr the array in which elements are swapped
     * @param i   index of the first element
     * @param j   index of the second element
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Partition the array segment between start and end
     * Choose the last element as the pivot and rearrange the array so that
     * elements less than or equal to the pivot are on the left, and greater ones on the right
     *
     * @param arr   the input array
     * @param start the starting index of the segment to partition
     * @param end   the ending index of the segment to partition (pivot index)
     *
     * @return the final index position of the pivot after partitioning
     */
    static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        return i;
    }

    /**
     * Main QuickSort method - recursively sorts the array between indices start and end
     *
     * @param arr   the array to be sorted
     * @param start lower index of the segment to sort
     * @param end   higher index of the segment to sort
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // Partition array and get pivot index
            int pivotIndex = partition(arr, start, end);

            // Recursively sort elements left of pivot
            quickSort(arr, start, pivotIndex - 1);

            // Recursively sort elements right of pivot
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    /**
     * Helper method to start QuickSort on whole array
     *
     * @param arr array to sort
     */
    static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // nothing to sort
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
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
