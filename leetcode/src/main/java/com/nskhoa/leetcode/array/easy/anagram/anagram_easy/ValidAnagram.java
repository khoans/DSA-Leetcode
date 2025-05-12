package com.nskhoa.leetcode.array.easy.anagram.anagram_easy;

import java.util.Arrays;

/*
https://leetcode.com/problems/valid-anagram/description/
Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public class ValidAnagram
{
    /*
    Approach 1: Sorting

    Time complexity: O(nlogn).
    Assume that n is the length of s, sorting costs O(nlogn) and comparing two strings costs O(n). Sorting time dominates and the overall time complexity is O(nlogn).

    Space complexity: O(1).
    Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used. Note that in Java, toCharArray() makes a copy of the string so it costs O(n) extra space, but we ignore this for complexity analysis because:

    It is a language dependent detail.
    It depends on how the function is designed. For example, the function parameter types can be changed to char[].
     */
    public static boolean isAnagramSorting(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    /*
    Approach 2: Frequency Counter

    Time complexity: O(n).
    Time complexity is O(n) because accessing the counter table is a constant time operation.

    Space complexity: O(1).
    Although we do use extra space, the space complexity is O(1) because the table's size stays constant no matter how large n is.
     */
    public static boolean isAnagramCounter(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            // In English, the alphabetical has the value ranged from 97 - 122 (map with a-z), so if s.charAt(i) = a
            // ==> 'a' - 'a' = 97 - 97 = 0;
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter)
        {
            if (count != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "nagaram";
        String t = "anagram";

        isAnagramCounter(s, t);

    }
}
