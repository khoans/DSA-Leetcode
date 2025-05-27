package com.nskhoa.sorting_algo.merge_sort;

public class MergeSort {

  static void merge(int[] arr, int left, int middle, int right) {
    int[] leftTempArr=  new int[middle-left +2];
    int[] rightTempArr = new int[right-middle +1];

    for (int i = 0 ; i <= middle-left ;i++) {
      leftTempArr[i] = arr[left+i];
    }
    for (int i = 0 ; i < right - middle ; i++) {
      rightTempArr[i] = arr[middle+i+1];
    }

    leftTempArr[middle-left+1] = Integer.MAX_VALUE;
    rightTempArr[right-middle] = Integer.MAX_VALUE;

    int i = 0, j = 0 ;
    for (int k = left; k <= right; k++) {
      if (leftTempArr[i] < rightTempArr[j]) {
        arr[k] = leftTempArr[i];
        i++;
      } else {
        arr[k] = rightTempArr[j];
        j++;
      }
    }
  }

  static void mergeSort(int[] arr, int left, int right) {
    if (right > left) {
      int middle = (left + right) /2;
      mergeSort(arr, left, middle);
      mergeSort(arr, middle + 1, right);
      merge(arr, left, middle, right);
    }
  }

  static void sort(int[] arr) {
    if (arr == null || arr.length <2) {
      return;
    }

    mergeSort(arr, 0, arr.length-1);
  }

	public static void printArray(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
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
