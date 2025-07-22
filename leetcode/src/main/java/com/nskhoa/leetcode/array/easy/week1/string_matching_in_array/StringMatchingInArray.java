package com.nskhoa.leetcode.array.easy.week1.string_matching_in_array;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    static class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> list = new ArrayList();
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (i != j) {
                        if (words[j].contains(words[i])) {
                            list.add(words[i]);
                            break;
                        }
                    }
                }
            }
            return list;
        }
    }

    public static void main(String[] args) {
        String[] words = new String[]{"leetcode", "et", "code"};
        Solution sol = new Solution();
        List<String> strings = sol.stringMatching(words);
        System.out.println(strings);
    }
}
