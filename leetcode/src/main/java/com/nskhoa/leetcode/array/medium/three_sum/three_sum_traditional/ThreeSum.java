package com.nskhoa.leetcode.array.medium.three_sum.three_sum_traditional;

/*
https://leetcode.com/problems/3sum/description/
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
 */

import java.util.*;

public class ThreeSum
{
    /*
    Approach 1: Two Pointers

    Time Complexity: O(n2). twoSumII is O(n), and we call it n times.

	Sorting the array takes O(nlogn), so overall complexity is O(nlogn+n2). This is asymptotically equivalent to O(n2).

	Space Complexity: from O(logn) to O(n), depending on the implementation of the sorting algorithm. For the purpose of complexity analysis, we ignore the memory required for the output.
     */
    public static List<List<Integer>> threeSumTwoPointer(int[] nums)
    {
        // Sort Array
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++)
        {
            if (i == 0 || (nums[i - 1] != nums[i]))
            {
                twoSumIITwoPointer(nums, i, res);
            }
        }
        return res;
    }

    static void twoSumIITwoPointer(int[] nums, int i, List<List<Integer>> res)
    {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right)
        {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum < 0)
            {
                left++;
            }
            else if (sum > 0)
            {
                right--;
            }
            else
            {
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while (left < right && nums[left] == nums[left - 1])
                {
                    left++;
                }
            }
        }
    }


    /*
    Approach 2: HashSet

	Time Complexity: O(n2). twoSum is O(n), and we call it n times.

	Sorting the array takes O(nlogn), so overall complexity is O(nlogn+n2). This is asymptotically equivalent to O(n2).

	Space Complexity: O(n) for the hashset.


     */

    public List<List<Integer>> threeSumHashSet(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
        {
            if (i == 0 || nums[i - 1] != nums[i])
            {
                twoSumHashSet(nums, i, res);
            }
        }
        return res;
    }

    void twoSumHashSet(int[] nums, int i, List<List<Integer>> res)
    {
        var seen = new HashSet<Integer>();
        for (int j = i + 1; j < nums.length; ++j)
        {
            int complement = -nums[i] - nums[j];
            if (seen.contains(complement))
            {
                res.add(Arrays.asList(nums[i], nums[j], complement));
                while (j + 1 < nums.length && nums[j] == nums[j + 1])
                {
                    ++j;
                }
            }
            seen.add(nums[j]);
        }
    }

    /*
    Approach 3: No-sort

	Time Complexity: O(n2). We have outer and inner loops, each going through n elements.

	While the asymptotic complexity is the same, this algorithm is noticeably slower than the previous approach. Lookups in a hashset, though requiring a constant time, are expensive compared to the direct memory access.

	Space Complexity: O(n) for the hashset/hashmap.

	For the purpose of complexity analysis, we ignore the memory required for the output. However, in this approach we also store output in the hashset for deduplication. In the worst case, there could be O(n2) triplets in the output, like for this example: [-k, -k + 1, ..., -1, 0, 1, ... k - 1, k]. Adding a new number to this sequence will produce n / 3 new triplets.
     */

    public List<List<Integer>> threeSumNoSort(int[] nums)
    {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
        {
            if (dups.add(nums[i]))
            {
                for (int j = i + 1; j < nums.length; ++j)
                {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        }
        return new ArrayList(res);
    }

    public static void main(String[] args)
    {
        int[] nums = {
                -3,
                -2,
                -1,
                0,
                1,
                2,
                3,
                5, - 1,
                -4
        };

        System.out.println(threeSumTwoPointer(nums));

    }
}
