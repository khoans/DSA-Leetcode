package com.nskhoa.leetcode.array.easy.week1.contain_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Practice {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();

            for (int num : nums) {
                if (!seen.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
