package com.nskhoa.leetcode.array.medium.sort_colors;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 * */
public class SortColors {
    class Solution {
        void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        /*
      Dutch National Flag problem solution.
      Time complexity: O(N)
        Space complexity: O(1)
      */
        public void sortColors(int[] nums) {
            // For all idx < i : nums[idx < i] = 0
            // j is an index of elements under consideration
            int p0 = 0, curr = 0;

            // For all idx > k : nums[idx > k] = 2
            int p2 = nums.length - 1;

            while (curr <= p2) {
                if (nums[curr] == 0) {
                    // Swap p0-th and curr-th elements
                    // i++ and j++
                    swap(nums, curr, p0);
                    p0++;
                    curr++;
                }
                else if (nums[curr] == 2) {
                    // Swap k-th and curr-th elements
                    // p2--
                    swap(nums, curr, p2);
                    p2--;
                }
                else {
                    curr++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

/*
Complexity Analysis

Time complexity : O(N) since it's one pass along the array of length N.

Space complexity : O(1) since it's a constant space solution.
* */
