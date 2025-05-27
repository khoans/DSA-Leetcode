package com.nskhoa.sorting_algo.quick_sort;

public class QuickSort {

  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j= start; j<=end; j++) {
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i;
  }

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot -1);
      quickSort(array, pivot + 1, end);
    }
  }



    static void sort(int[] arr) {
        if (arr == null || arr.length <2) {
            return;
        }

        quickSort(arr, 0, arr.length-1);
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
