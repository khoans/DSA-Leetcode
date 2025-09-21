package com.nskhoa.leetcode.array.medium.find_peak_element;

/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.


Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
* */
public class FindPeakElement {
    class Solution {
        public int findPeakElement(int[] nums) {
            // Initial pointers for the search range
            int start = 0;
            int end = nums.length - 1;

            // Keep narrowing the range until we find the peak
            while (start < end) {
                // Find the middle of the current range
                int middle = start + (end - start) / 2;

                // Check if the middle element is greater than its next neighbor
                if (nums[middle] > nums[middle + 1]) {
                    // If it is, the peak must be in the left part of the array
                    end = middle;
                }
                else {
                    // If not, the peak must be in the right part of the array
                    start = middle + 1;
                }
            }

            // When start equals end, we've found the peak
            return start;
        }
    }

    public static void main(String[] args) {
        Solution solution = new FindPeakElement().new Solution();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.findPeakElement(nums1)); // Output: 2

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(solution.findPeakElement(nums2)); // Output: 5
    }
}

/*
 Time complexity : O(log2(n)). We reduce the search space in half at every step. Thus, the total search space will be consumed in log2(n) steps. Here, n refers to the size of nums array.

Space complexity : O(1). Constant extra space is used.
* */
