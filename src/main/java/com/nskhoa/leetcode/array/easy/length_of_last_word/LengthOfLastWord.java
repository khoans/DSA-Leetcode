package com.nskhoa.leetcode.array.easy.length_of_last_word;

/*
https://leetcode.com/problems/length-of-last-word/description/
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */

public class LengthOfLastWord
{

    /*
    Approach 1: String Index Manipulation

	Time Complexity: O(N), where N is the length of the input string.

	In the worst case, the input string might contain only a single word, which implies that we would need to iterate through the entire string to obtain the result.

	Space Complexity: O(1), only constant memory is consumed, regardless the input.
     */

    public int lengthOfLastWord1(String s) {
        // trim the trailing spaces
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        // compute the length of last word
        int length = 0;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }

    /*
    Approach 2: One-loop Iteration

	Time Complexity: O(N), where N is the length of the input string.

	This approach has the same time complexity as the previous approach. The only difference is that we combined two loops into one.

	Space Complexity: O(1), again a constant memory is consumed, regardless the input.

     */

    public int lengthOfLastWord2(String s) {
        int p = s.length(), length = 0;
        while (p > 0) {
            p--;
            // we're in the middle of the last word
            if (s.charAt(p) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }

    /*
    Approach 3: Built-in String function
    Time Complexity: O(N), where N is the length of the input string.

	Since we use some built-in function from the String data type, we should look into the complexity of each built-in function that we used, in order to obtain the overall time complexity of our algorithm.

	It would be safe to assume the time complexity of the methods such as str.split() and String.lastIndexOf() to be O(N), since in the worst case we would need to scan the entire string for both methods.

	Space Complexity: O(N). Again, we should look into the built-in functions that we used in the algorithm.

	In the Java implementation, we used the function String.trim() which returns a copy of the input string without leading and trailing whitespace. Therefore, we would need O(N) space for our algorithm to hold this copy.

	In the Python implementation, we used str.split(), which returns a list of substrings that are separated by the space delimiter. As a result, we would need O(N) space for our algorithm to store this list.

     */

    public int lengthOfLastWord3(String s) {
        s = s.trim(); // trim the trailing spaces in the string
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
