package com.nskhoa.leetcode.array.medium.top_k_frequent_elements;

/*
https://leetcode.com/problems/top-k-frequent-elements/description/
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.


Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.


Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

import java.util.*;

import static java.util.Collections.swap;

public class TopKFrequentElements
{
    /*
    Approach 1: Heap

    Complexity Analysis

    Time complexity : O(Nlogk) if k<N and O(N) in the particular case of N=k. That ensures time complexity to be better than O(NlogN).

    Space complexity : O(N+k) to store the hash map with not more N elements and a heap with k elements.
     */

    public int[] topKFrequent1(int[] nums, int k)
    {
        // O(1) time
        if (k == nums.length)
        {
            return nums;
        }

        // 1. Build hash map: character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n : nums)
        {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

        // 2. Keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n : count.keySet())
        {
            heap.add(n);
            if (heap.size() > k)
            {
                heap.poll();
            }
        }

        // 3. Build an output array
        // O(k log k) time
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i)
        {
            top[i] = heap.poll();
        }
        return top;
    }

    /*
    Approach 2: Quickselect (Hoare's selection algorithm)
    Time complexity: O(N) in the average case, O(N2) in the worst case.
    Space complexity: up to O(N) to store hash map and array of unique elements.

     */

    class Solution
    {
        int[] unique;
        Map<Integer, Integer> count;

        public void swap(int a, int b)
        {
            int tmp = unique[a];
            unique[a] = unique[b];
            unique[b] = tmp;
        }

        public int partition(int left, int right, int pivot_index)
        {
            int pivot_frequency = count.get(unique[pivot_index]);
            // 1. Move pivot to end
            swap(pivot_index, right);
            int store_index = left;

            // 2. Move all less frequent elements to the left
            for (int i = left; i <= right; i++)
            {
                if (count.get(unique[i]) < pivot_frequency)
                {
                    swap(store_index, i);
                    store_index++;
                }
            }

            // 3. Move the pivot to its final place
            swap(store_index, right);

            return store_index;
        }

        public void quickselect(int left, int right, int k_smallest)
        {
        /*
        Sort a list within left..right till kth less frequent element
        takes its place.
        */

            // base case: the list contains only one element
            if (left == right)
            {
                return;
            }

            //Select a random pivot_index
            Random random_num = new Random();
            int pivot_index = left + random_num.nextInt(right - left);

            // Find the pivot position in a sorted list
            pivot_index = partition(left, right, pivot_index);

            // If the pivot is in its final sorted position
            if (k_smallest == pivot_index)
            {
                return;
            }
            else if (k_smallest < pivot_index)
            {
                // go left
                quickselect(left, pivot_index - 1, k_smallest);
            }
            else
            {
                // go right
                quickselect(pivot_index + 1, right, k_smallest);
            }
        }

        public int[] topKFrequent(int[] nums, int k)
        {
            // Build hash map: character and how often it appears
            count = new HashMap();
            for (int num : nums)
            {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            // Array of unique elements
            int n = count.size();
            unique = new int[n];
            int i = 0;
            for (int num : count.keySet())
            {
                unique[i] = num;
                i++;
            }

            // kth top frequent element is (n - k)th less frequent.
            // Do a partial sort: from less frequent to the most frequent, till
            // (n - k)th less frequent element takes its place (n - k) in a sorted array.
            // All elements on the left are less frequent.
            // All the elements on the right are more frequent.
            quickselect(0, n - 1, n - k);
            // Return top k frequent elements
            return Arrays.copyOfRange(unique, n - k, n);
        }
    }
}
