package com.nskhoa.leetcode.array.easy.special_array;

public class SpecialArray {
    static class Solution {
        public static int specialArray(int[] nums) {
            int n = nums.length;
            int[] freq = new int[n+1];

            for (int i = 0 ; i < nums.length ; i++) {
                freq[Math.min(n, nums[i])]++;
            }

            int numGreaterOrEqual = 0;
            for (int i = n; i >=1 ; i--) {
                numGreaterOrEqual += freq[i];
                if (i == numGreaterOrEqual) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{0,4,3,0,4};
//            int[] arr = new int[]{3,5};

            int res = specialArray(arr);
            System.out.println("special number of X is " + res + " because there are " + res + " number in the array " +
                    "is greater than " + res);
        }
    }
}

