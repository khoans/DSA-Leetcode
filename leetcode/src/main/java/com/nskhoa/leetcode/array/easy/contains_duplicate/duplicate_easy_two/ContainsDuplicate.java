package com.nskhoa.leetcode.array.easy.contains_duplicate.duplicate_easy_two;

/*
https://leetcode.com/problems/contains-duplicate-ii/description/
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */

import java.util.*;

public class ContainsDuplicate
{
    /*
    Approach 1: Naive Linear Search

    Time complexity : O(nmin(k,n)).
	It costs O(min(k,n)) time for each linear search. Apparently we do at most n comparisons in one search even if k can be larger than n.

	Space complexity : O(1).
     */
    public boolean containsNearbyDuplicate1(int[] nums, int k)
    {
        for (int i = 0; i < nums.length; ++i)
        {
            for (int j = Math.max(i - k, 0); j < i; ++j)
            {
                if (nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;

        // Time Limit Exceeded.
    }


    /*
    Approach 2: Binary Search Tree

    Time complexity : O(nlog(min(k,n))). We do n operations of search, delete and insert. Each operation costs logarithmic time complexity in the sliding window which size is min(k,n). Note that even if k can be greater than n, the window size can never exceed n.

	Space complexity : O(min(n,k)).
	Space is the size of the sliding window which should not exceed n or k.
     */

    public boolean containsNearbyDuplicate2(int[] nums, int k)
    {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i)
        {
            if (set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k)
            {
                set.remove(nums[i - k]);
            }
        }
        return false;
        // Time Limit Exceeded.
    }

    /*
    Approach 3: Hash Table

    Time complexity : O(n).
	We do n operations of search, delete and insert, each with constant time complexity.

	Space complexity : O(min(n,k)).
	The extra space required depends on the number of items stored in the hash table, which is the size of the sliding window, min(n,k).
     */

    public boolean containsNearbyDuplicate3(int[] nums, int k)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i)
        {
            if (set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k)
            {
                // This ensures that the sliding window contains only the last 'k' elements.
                // By removing nums[i - k], we effectively discard elements that are no longer within the range [i - k, i],
                //  which guarantees that abs(i - j) <= k for any duplicate found in the set.
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicatesUsingHashMap(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (hm.containsKey(nums[i]) && Math.abs(hm.get(nums[i]) - i) <= k) {
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}
