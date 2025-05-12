package com.nskhoa.leetcode.array.easy.palindrome.valid_palindrome;

/*
https://leetcode.com/problems/valid-palindrome/description/

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

public class ValidPalindrome
{
    /*
    Approach 1: Compare with reverse

    Time complexity : O(n), in length n of the string.

	We need to iterate thrice through the string:

	When we filter out non-alphanumeric characters, and convert the remaining characters to lower-case.
	When we reverse the string.
	When we compare the original and the reversed strings.
	Each iteration runs linear in time (since each character operation completes in constant time). Thus, the effective run-time complexity is linear.

	Space complexity : O(n), in length n of the string. We need O(n) additional space to stored the filtered string and the reversed string.
     */

    public boolean isPalindrome1(String s)
    {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    public boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s
                .chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }

    /*
    Approach 2: Two Pointers

    Time complexity : O(n), in length n of the string. We traverse over each character at-most once, until the two pointers meet in the middle, or when we break and return early.

	Space complexity : O(1). No extra space required, at all.
     */

    public static boolean isPalindrome2(String s)
    {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (
                    Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))
            ) return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome2(s));
    }
}
