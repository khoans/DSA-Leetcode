package com.nskhoa.leetcode.array.easy.longest_strictly_increasing_or_decreasing_subarray;

/*
You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.



Example 1:

Input: nums = [1,4,3,3,2]

Output: 2

Explanation:

The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

Hence, we return 2.

Example 2:

Input: nums = [3,3,3,3]

Output: 1

Explanation:

The strictly increasing subarrays of nums are [3], [3], [3], and [3].

The strictly decreasing subarrays of nums are [3], [3], [3], and [3].

Hence, we return 1.

Example 3:

Input: nums = [3,2,1]

Output: 3

Explanation:

The strictly increasing subarrays of nums are [3], [2], and [1].

The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].

Hence, we return 3.



Constraints:

1 <= nums.length <= 50
1 <= nums[i] <= 50
 * */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    /*
     * Time: O(n)
     * Space: O(1)
     * */
    class Solution {

        public int longestMonotonicSubarray(int[] nums) {
            // Track current lengths of increasing and decreasing sequences
            int incLength = 1, decLength = 1;
            int maxLength = 1;

            // Iterate through array comparing adjacent elements
            for (int pos = 0; pos < nums.length - 1; pos++) {
                if (nums[pos + 1] > nums[pos]) {
                    // If next element is larger, extend increasing sequence
                    incLength++;
                    decLength = 1; // Reset decreasing sequence
                }
                else if (nums[pos + 1] < nums[pos]) {
                    // If next element is smaller, extend decreasing sequence
                    decLength++;
                    incLength = 1; // Reset increasing sequence
                }
                else {
                    // If elements are equal, reset both sequences
                    incLength = 1;
                    decLength = 1;
                }

                // Update max length considering both sequences
                maxLength = Math.max(maxLength, Math.max(incLength, decLength));
            }
            return maxLength;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray().new Solution();
        System.out.println(solution.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2})); // 2
        System.out.println(solution.longestMonotonicSubarray(new int[]{3, 3, 3, 3})); // 1
        System.out.println(solution.longestMonotonicSubarray(new int[]{3, 2, 1})); // 3
    }
}
