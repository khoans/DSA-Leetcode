package com.nskhoa.leetcode.array.medium.subarray_sum_equals_k;

import java.util.HashMap;

/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2


Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 * */
public class SubarraySumEqualsK {
    /*
Complexity Analysis

Time complexity : O(n). The entire nums array is traversed only once.

Space complexity : O(n). Hashmap map can contain up to n distinct entries in the worst case.


     * */
    public class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0, sum = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
    }

    /*
Complexity Analysis

Time complexity : O(n2). We need to consider every subarray possible.

Space complexity : O(1). Constant space is used.
     * */
    public class Solution2 {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int start = 0; start < nums.length; start++) {
                int sum = 0;
                for (int end = start; end < nums.length; end++) {
                    sum += nums[end];
                    if (sum == k) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
