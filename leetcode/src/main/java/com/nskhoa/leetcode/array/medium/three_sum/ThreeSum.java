package com.nskhoa.leetcode.array.medium.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 * */
public class ThreeSum {
    /*
    Time Complexity: O(n^2)
    Space Complexity: O(log n) to O(n), depending on the implementation of the sorting algorithm.
    * */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
                if (
                        i == 0 || nums[i - 1] != nums[i]
                ) {
                    twoSumII(nums, i, res);
                }
            }
            return res;
        }

        void twoSumII(int[] nums, int i, List<List<Integer>> res) {
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum < 0) {
                    ++lo;
                }
                else if (sum > 0) {
                    --hi;
                }
                else {
                    List<Integer> arr = Arrays.asList(nums[i], nums[lo], nums[hi]);
                    res.add(arr);
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) {
                        lo++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums)); // [[-1,-1,2],[-1,0,1]]
    }
}
