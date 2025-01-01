package com.nskhoa.leetcode.array.medium.three_sum.three_sum_closest;

/*
https://leetcode.com/problems/3sum-closest/description/
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
 */

import java.util.Arrays;

public class ThreeSumClosest
{
    /*
    Approach 1: Two Pointers
    Time Complexity: O(n2). We have outer and inner loops, each going through n elements.
	Sorting the array takes O(nlogn), so overall complexity is O(nlogn+n2). This is asymptotically equivalent to O(n2).

	Space Complexity: from O(logn) to O(n), depending on the implementation of the sorting algorithm.
     */
    public int threeSumClosest(int[] nums, int target)
    {
        int diff = Integer.MAX_VALUE;
        int sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i)
        {
            int lo = i + 1;
            int hi = sz - 1;
            while (lo < hi)
            {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(diff))
                {
                    diff = target - sum;
                }
                if (sum < target)
                {
                    ++lo;
                }
                else
                {
                    --hi;
                }
            }
        }
        return target - diff;
    }


    /*
    Approach 2: Binary Search

	Time Complexity: O(n2logn). Binary search takes O(logn), and we do it n times in the inner loop. Since we are going through n elements in the outer loop, the overall complexity is O(n2logn).

	Space Complexity: from O(logn) to O(n), depending on the implementation of the sorting algorithm.
     */
    public int binarySearch(int[] nums, int target)
    {
        int diff = Integer.MAX_VALUE;
        int sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i)
        {
            for (int j = i + 1; j < sz - 1; ++j)
            {
                int complement = target - nums[i] - nums[j];
                var idx = Arrays.binarySearch(nums, j + 1, sz - 1, complement);
                int hi = idx >= 0 ? idx : ~idx, lo = hi - 1;
                if (hi < sz && Math.abs(complement - nums[hi]) < Math.abs(diff))
                {
                    diff = complement - nums[hi];
                }
                if (lo > j && Math.abs(complement - nums[lo]) < Math.abs(diff))
                {
                    diff = complement - nums[lo];
                }
            }
        }
        return target - diff;
    }
}
