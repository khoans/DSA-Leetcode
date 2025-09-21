package com.nskhoa.leetcode.array.easy.maximum_ascending_subarray_sum;

/**
 * 1800. Maximum Ascending Subarray Sum
 * <p>
 * An ascending subarray is defined as a contiguous sequence of numbers where each number is strictly greater than the previous one. Given an array of positive integers nums, return the maximum possible sum of an ascending subarray.
 * <p>
 * A subarray is a contiguous sequence of elements within an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 * Example 2:
 * <p>
 * Input: nums = [10,20,30,40,50]
 * Output: 150
 * Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
 * Example 3:
 * <p>
 * Input: nums = [12,17,15,13,10,11,12]
 * Output: 33
 * Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 * Example 4:
 * <p>
 * Input: nums = [100,10,1]
 * Output: 100
 * Explanation: [100] is the ascending subarray with the maximum sum of 100.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class MaximumAscendingSubarraySum {
    class Solution {

        public int maxAscendingSum(int[] nums) {
            int maxSum = 0;
            int currentSubarraySum = nums[0];

            // Loop through the array starting from the second element
            for (int currentIdx = 1; currentIdx < nums.length; ++currentIdx) {
                if (nums[currentIdx] <= nums[currentIdx - 1]) {
                    // If the current element is not greater than the previous one,
                    // update maxSum
                    maxSum = Math.max(maxSum, currentSubarraySum);
                    // Reset the sum for the next ascending subarray
                    currentSubarraySum = 0;
                }
                currentSubarraySum += nums[currentIdx];
            }

            // Final check after the loop ends to account for the last ascending
            // subarray
            return Math.max(maxSum, currentSubarraySum);
        }
    }
}
