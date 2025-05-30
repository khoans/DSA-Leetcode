package com.nskhoa.leetcode.array.medium.two_sum_sorted_array;

/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSumSortedArray
{

    // optimal
    public int[] twoSumBestApproach(int[] numbers, int target)
    {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high)
        {
            int sum = numbers[low] + numbers[high];

            if (sum == target)
            {
                return new int[]{
                        low + 1,
                        high + 1
                };
            }
            else if (sum < target)
            {
                ++low;
            }
            else
            {
                --high;
            }
        }
        // In case there is no solution, return {-1, -1}.
        return new int[]{
                -1,
                -1
        };
    }

    // suboptimal
    public int[] twoSumSecondApproach(int[] numbers, int target)
    {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
        {
            int complement = target - numbers[i];
            if (hm.containsKey(complement))
            {
                int firstIndex = Math.min(i, hm.get(complement));
                int secondIndex = Math.max(i, hm.get(complement));
                return new int[]{
                        firstIndex + 1,
                        secondIndex + 1
                };
            }
            hm.put(numbers[i], i);
        }

        return new int[]{};
    }
}
