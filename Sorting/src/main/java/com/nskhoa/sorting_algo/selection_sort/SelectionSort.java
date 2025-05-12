package com.nskhoa.sorting_algo.selection_sort;

public class SelectionSort
{

    // This is the opposite of the bubble sort. In bubblesort, we find the largest element and place them at the end.
    // In Selection sort, we find the smallest element to place it at the start of the array
    static void selectionSort(int[] a)
    {
        // First pointer
        for (int j = 0; j < a.length; j++)
        {
            // Track the minimum number
            int minimumIndex = j;
            // Second pointer
            for (int i = j + 1; i < a.length; i++)
            {
                // If the traverse arr < current minimum number => update the index
                if (a[i] < a[minimumIndex])
                {
                    minimumIndex = i;
                }
            }

            // If there is a new minimum number => swap the two
            if (minimumIndex != j)
            {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
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
                1
        };

        selectionSort(arr);
        printArray(arr);
    }
}
