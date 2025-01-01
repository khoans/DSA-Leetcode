package com.nskhoa.leetcode.array.medium.three_sum.three_sum_smaller;

/*
https://leetcode.com/problems/3sum-smaller/description/
Given an array of n integers nums and an integer target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.



Example 1:

Input: nums = [-2,0,1,3], target = 2
Output: 2
Explanation: Because there are two triplets which sums are less than 2:
[-2,0,1]
[-2,0,3]
Example 2:

Input: nums = [], target = 0
Output: 0
Example 3:

Input: nums = [0], target = 0
Output: 0


Constraints:

n == nums.length
0 <= n <= 3500
-100 <= nums[i] <= 100
-100 <= target <= 100
 */

import java.util.Arrays;

public class ThreeSumSmaller
{

    /*
    Approach 1: Two Pointers
    Time complexity: O(n2).twoSumSmaller takes O(n) at most since it touches each element in the array once. It's parent function, threeSumSmaller takes O(nlogn) to sort the array, then runs a loop that touches (n−2) elements, invoking twoSumSmaller at each iteration. Therefore, the overall time complexity is O(nlogn+n2), which boils down to O(n2).

	Space complexity: O(1) because no additional data structures are used.
     */

    public int threeSumSmallerTwoPointer(int[] nums, int target)
    {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++)
        {
            sum += twoSumSmallerTwoPointer(nums, i + 1, target - nums[i]);
        }
        return sum;
    }

    private int twoSumSmallerTwoPointer(int[] nums, int startIndex, int target)
    {
        int sum = 0;
        int left = startIndex;
        int right = nums.length - 1;
        while (left < right)
        {
            if (nums[left] + nums[right] < target)
            {
                sum += right - left;
                left++;
            }
            else
            {
                right--;
            }
        }
        return sum;
    }

    /*
    Approach 2: Binary Search

	Time complexity: O(n2logn).The binarySearch function takes O(logn) time, therefore the twoSumSmaller takes O(nlogn) time. The threeSumSmaller wraps with another for-loop, and therefore is O(n2logn) time.

	Space complexity: O(1) because no additional data structures are used.
     */
    public int threeSumSmallerBinary(int[] nums, int target)
    {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++)
        {
            sum += twoSumSmallerBinary(nums, i + 1, target - nums[i]);
        }
        return sum;
    }

    private int twoSumSmallerBinary(int[] nums, int startIndex, int target)
    {
        int sum = 0;
        for (int i = startIndex; i < nums.length - 1; i++)
        {
            int j = binarySearch(nums, i, target - nums[i]);
            sum += j - i;
        }
        return sum;
    }

    private int binarySearch(int[] nums, int startIndex, int target)
    {
        int left = startIndex;
        int right = nums.length - 1;
        while (left < right)
        {
            int mid = (left + right + 1) / 2;
            if (nums[mid] < target)
            {
                left = mid;
            }
            else
            {
                right = mid - 1;
            }
        }
        return left;
    }
}
