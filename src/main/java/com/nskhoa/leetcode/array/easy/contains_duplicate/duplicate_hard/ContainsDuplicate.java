package com.nskhoa.leetcode.array.easy.contains_duplicate.duplicate_hard;

/*
https://leetcode.com/problems/contains-duplicate-iii/description/
You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.



Example 1:

Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
Example 2:

Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
Output: false
Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.


Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
1 <= indexDiff <= nums.length
0 <= valueDiff <= 109
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ContainsDuplicate
{
    /*
    Approach 1: Binary Search Tree

    Time complexity: O(nlog(min(n,k))).
	We iterate through the array of size n. For each iteration, it costs O(logmin(k,n)) time (search, insert or delete) in the BST, since the size of the BST is upper bounded by both k and n.

	Space complexity: O(min(n,k)).
	Space is dominated by the size of the BST, which is upper bounded by both k and n.

	- Note

	When the array's elements and t's value are large, they can cause overflow in arithmetic operation. Consider using a larger size data type instead, such as long.

	C++'s std::set, std::set::upper_bound and std::set::lower_bound are equivalent to Java's TreeSet, TreeSet::ceiling and TreeSet::floor, respectively. Python does not provide a Self-balancing BST through its library.
     */
    public boolean containsNearbyAlmostDuplicate1(int[] nums, int indexDiff, int valueDiff)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i)
        {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && (long) s <= nums[i] + valueDiff)
            {
                return true;
            }

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= (long) g + valueDiff)
            {
                return true;
            }

            set.add(nums[i]);
            if (set.size() > indexDiff)
            {
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    }


    /*
    Approach 3: Bucket

    Time complexity: O(n).
	For each of the n elements, we do at most three searches, one insert, and one delete on the HashMap, which costs constant time on average. Thus, the entire algorithm costs O(n) time.

	Space complexity: O(min(n,k)).
	Space is dominated by the HashMap, which is linear to the size of its elements. The size of the HashMap is upper bounded by both n and k. Thus the space complexity is O(min(n,k)).
     */
    public boolean containsNearbyAlmostDuplicate2(int[] nums, int indexDiff, int valueDiff)
    {
        if (valueDiff < 0)
        {
            return false;
        }
        Map<Long, Long> buckets = new HashMap<>();
        long w = (long) valueDiff + 1;
        for (int i = 0; i < nums.length; ++i)
        {
            long bucket = getID(nums[i], w);
            // check if current bucket is empty, each bucket may contain at most one element
            if (buckets.containsKey(bucket))
            {
                return true;
            }
            // check the neighbor buckets for almost duplicate
            if (buckets.containsKey(bucket - 1) && Math.abs(nums[i] - buckets.get(bucket - 1)) < w)
            {
                return true;
            }
            if (buckets.containsKey(bucket + 1) && Math.abs(nums[i] - buckets.get(bucket + 1)) < w)
            {
                return true;
            }
            // now bucket is empty and no almost duplicate in neighbor buckets
            buckets.put(bucket, (long) nums[i]);
            if (i >= indexDiff)
            {
                buckets.remove(getID(nums[i - indexDiff], w));
            }
        }
        return false;
    }

    private long getID(long x, long w)
    {
        return Math.floorDiv(x, w);
    }
}
