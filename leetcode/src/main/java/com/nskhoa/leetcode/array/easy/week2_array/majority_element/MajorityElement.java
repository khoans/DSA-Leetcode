package com.nskhoa.leetcode.array.easy.week2_array.majority_element;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
 * */
public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;

            for (int n : nums) {
                if (count == 0) {
                    candidate = n;
                }

                if (candidate == n) {
                    count++;
                }
                else {
                    count--;
                }
            }

            return candidate;
        }
    }

    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        int[] nums = {3, 2, 3, 1, 2, 3, 3};
        System.out.println(solution.majorityElement(nums)); // Output: 3
    }
}
