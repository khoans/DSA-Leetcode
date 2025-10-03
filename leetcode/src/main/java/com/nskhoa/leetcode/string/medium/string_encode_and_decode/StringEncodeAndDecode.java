package com.nskhoa.leetcode.string.medium.string_encode_and_decode;

import java.util.ArrayList;
import java.util.List;

/*
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

string encode(vector<string> strs) {
  // ... your code
  return encoded_string;
}
Machine 2 (receiver) has the function:
vector<string> decode(string s) {
  //... your code
  return strs;
}
So Machine 1 does:

string encoded_string = encode(strs);
and Machine 2 does:

vector<string> strs2 = decode(encoded_string);
strs2 in Machine 2 should be the same as strs in Machine 1.

Implement the encode and decode methods.

You are not allowed to solve the problem using any serialize methods (such as eval).



Example 1:

Input: dummy_input = ["Hello","World"]
Output: ["Hello","World"]
Explanation:
Machine 1:
Codec encoder = new Codec();
String msg = encoder.encode(strs);
Machine 1 ---msg---> Machine 2

Machine 2:
Codec decoder = new Codec();
String[] strs = decoder.decode(msg);
Example 2:

Input: dummy_input = [""]
Output: [""]


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] contains any possible characters out of 256 valid ASCII characters.


Follow up: Could you write a generalized algorithm to work on any possible set of characters?
 * */
public class StringEncodeAndDecode {
    class Codec {
        public String encode(List<String> strs) {
            // Initialize a StringBuilder to hold the encoded string.
            StringBuilder encodedString = new StringBuilder();
            for (String s : strs) {
                // Append the length, the delimiter, and the string itself.
                encodedString
                        .append(s.length())
                        .append("/:")
                        .append(s);
            }
            return encodedString.toString();
        }

        public List<String> decode(String s) {
            // Initialize a list to hold the decoded strings.
            List<String> decodedStrings = new ArrayList<>();
            int i = 0;
            while (i < s.length()) {
                // Find the delimiter.
                int delim = s.indexOf("/:", i);
                // Get the length, which is before the delimiter.
                int length = Integer.parseInt(s.substring(i, delim));
                // Get the string, which is of 'length' length after the delimiter.
                String str = s.substring(delim + 2, delim + 2 + length);
                // Add the string to the list.
                decodedStrings.add(str);
                // Move the index to the start of the next length.
                i = delim + 2 + length;
            }
            return decodedStrings;
        }
    }

    public static void main(String[] args) {
        Codec codec = new StringEncodeAndDecode().new Codec();
        List<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("World");
        String encoded = codec.encode(strs);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
}
