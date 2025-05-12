package com.nskhoa.leetcode.array.easy.single_number;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/single-number/description
 * We use hash table to avoid the O(n) time required for searching the elements.
 * Iterate through all elements in nums and set up key/value pair.
 * Return the element which appeared only once.
 * Complexity Analysis
 * - Time complexity : O(n⋅1)=O(n). Time complexity of for loop is O(n). Time complexity of hash table(dictionary in
 * python) operation pop is O(1).
 * - Space complexity : O(n). The space required by hash_table is equal to the number of elements in nums.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4,
                1,
                2,
                1,
                2};
        System.out.println(singleNumber.singleNumber(nums)); // Output: 4
    }
}
