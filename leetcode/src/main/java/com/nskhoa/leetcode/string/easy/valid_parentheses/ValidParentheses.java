package com.nskhoa.leetcode.string.easy.valid_parentheses;

import java.util.HashMap;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 * */
public class ValidParentheses {
    /*
    Time Complexity: O(n), where n is the length of the string. We traverse the string once.
    Space Complexity: O(n) in the worst case, when all the opening brackets are stored
    * */
    class Solution {
        // Hash table that takes care of the mappings.
        private HashMap<Character, Character> mappings;

        // Initialize hash map with mappings. This simply makes the code easier to read.
        public Solution() {
            this.mappings = new HashMap<Character, Character>();
            this.mappings.put(')', '(');
            this.mappings.put('}', '{');
            this.mappings.put(']', '[');
        }

        public boolean isValid(String s) {
            // Initialize a stack to be used in the algorithm.
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // If the current character is a closing bracket.
                if (this.mappings.containsKey(c)) {
                    // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                    char topElement = stack.empty()
                                      ? '#'
                                      : stack.pop();

                    // If the mapping for this bracket doesn't match the stack's top element, return false.
                    if (topElement != this.mappings.get(c)) {
                        return false;
                    }
                }
                else {
                    // If it was an opening bracket, push to the stack.
                    stack.push(c);
                }
            }

            // If the stack still contains elements, then it is an invalid expression.
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([])")); // true
        System.out.println(solution.isValid("([)]")); // false
    }
}
