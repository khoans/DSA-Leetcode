package com.nskhoa.leetcode.array.easy.anagram.anagram_group;

import java.util.*;

/*
https://leetcode.com/problems/group-anagrams/description/
Given an array of strings strs, group the
anagrams
 together. You can return the answer in any order.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]



Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */

public class AnagramGroups
{
    /*
    Approach 1: Categorize by Sorted String

    Time Complexity: O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs. The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.

	Space Complexity: O(NK), the total information content stored in ans.
     */
    public List<List<String>> groupAnagramsSortedString(String[] strs)
    {
        if (strs.length == 0)
        {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs)
        {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key))
            {
                ans.put(key, new ArrayList());
            }
            ans
                    .get(key)
                    .add(s);
        }
        return new ArrayList(ans.values());
    }


    /*
	Approach 2: Categorize by Count

	Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs. Counting each string is linear in the size of the string, and we count every string.

	Space Complexity: O(NK), the total information content stored in ans.
     */
    public List<List<String>> groupAnagramsCount(String[] strs)
    {
        if (strs.length == 0)
        {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs)
        {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray())
            {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++)
            {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key))
            {
                ans.put(key, new ArrayList());
            }
            ans
                    .get(key)
                    .add(s);
        }
        return new ArrayList(ans.values());
    }

}
