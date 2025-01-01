package com.nskhoa.leetcode.array.easy.contains_duplicate.duplicate_easy_one;

/*
https://leetcode.com/problems/contains-duplicate/description
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate
{
    /*
    Approach 1: Sorting

    Time complexity: O(nlogn).
	Sorting is O(nlogn) and the sweeping is O(n). The entire algorithm is dominated by the sorting step, which is O(nlogn).

	Space complexity: O(1).
	Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used.
     */

    public boolean containsDuplicateSorting(int[] nums)
    {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i)
        {
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }
        return false;
    }

    /*
    Approach 2: Hash Table
    Time complexity: O(n).
	We do search() and insert() for n times and each operation takes constant time.

	Space complexity: O(n).
	The space used by a hash table is linear with the number of elements in it.
     */

    public boolean containsDuplicateHashTable(int[] nums)
    {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums)
        {
            if (set.contains(x))
            {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
