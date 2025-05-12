package com.nskhoa.sorting_algo.bubble_sort;

public class BubbleSort
{


    // Purpose of the outer loop is to find the largest element to place at the end of array, so the inner loop we
    // don't need to check that last element anymore (hence n-i-1)
    static void bubbleSort(int arr[])
    {
        int n = arr.length;

        // First pointer
        for (int i = 0; i < n - 1; i++)
        {
            // Second pointer, since the largest number is sorted at the end, no need to check anymore
            for (int j = 0; j < n - i - 1; j++)
            {
                // If the current number is greater than the number after, swap the two
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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
                5,
                3,
                1
        };

        bubbleSort(arr);
    }
}
