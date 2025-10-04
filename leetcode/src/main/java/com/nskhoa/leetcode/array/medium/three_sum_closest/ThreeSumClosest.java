package com.nskhoa.leetcode.array.medium.three_sum_closest;

import java.util.Arrays;

/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 * */
public class ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closest_sum = Integer.MAX_VALUE / 2; // A large value but not overflow
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int high = nums.length - 1;
                int low = i + 1;
                while (low < high) {
                    int currsum = nums[high] + nums[low] + nums[i];
                    int distance = Math.abs(target - currsum);
                    if (distance < Math.abs(target - closest_sum)) {
                        closest_sum = currsum;
                    }
                    if (currsum == target) {
                        return currsum;
                    }
                    else if (currsum < target) {
                        low++;
                    }
                    else {
                        high--;
                    }
                }

            }
            return closest_sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(solution.threeSumClosest(nums, target)); // 2
    }
}
