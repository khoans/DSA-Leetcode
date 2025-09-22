package com.nskhoa.leetcode.array.easy.single_number;

import java.util.HashMap;
import java.util.Map;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1



Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
* */
public class SingleNumber {
    /*
    Time complexity: O(n)
    Space complexity: O(n)
    * */
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> hm = new HashMap<>();

            for (int num : nums) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }

            for (int num : nums) {
                if (hm.get(num) == 1) {
                    return num;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums));
    }
}
