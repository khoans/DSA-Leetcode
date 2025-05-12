package com.nskhoa.leetcode.array.medium.encode_and_decode_string.tinyurl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
https://leetcode.com/problems/encode-and-decode-tinyurl/description/
Note: This is a companion problem to the System Design problem: Design TinyURL.
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Solution class:

Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.


Example 1:

Input: url = "https://leetcode.com/problems/design-tinyurl"
Output: "https://leetcode.com/problems/design-tinyurl"

Explanation:
Solution obj = new Solution();
string tiny = obj.encode(url); // returns the encoded tiny url.
string ans = obj.decode(tiny); // returns the original url after decoding it.
 */
public class EncodeAndDecodeTinyURL
{
    /*
    Approach #1 Using Simple Counter

	Performance Analysis

    The range of URLs that can be decoded is limited by the range of int.

    If excessively large number of URLs have to be encoded, after the range of int is exceeded, integer overflow could lead to overwriting the previous URLs' encodings, leading to the performance degradation.

    The length of the URL isn't necessarily shorter than the incoming longURL. It is only dependent on the relative order in which the URLs are encoded.

    One problem with this method is that it is very easy to predict the next code generated, since the pattern can be detected by generating a few encoded URLs.
     */

    public class Codec {
        Map<Integer, String> map = new HashMap<>();
        int i = 0;

        public String encode(String longUrl) {
            map.put(i, longUrl);
            return "http://tinyurl.com/" + i++;
        }

        public String decode(String shortUrl) {
            return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
        }
    }

    /*
    Approach #2 Variable-length Encoding

	Performance Analysis

    The number of URLs that can be encoded is, again, dependent on the range of int, since, the same count will be generated after overflow of integers.

    The length of the encoded URLs isn't necessarily short, but is to some extent dependent on the order in which the incoming longURL's are encountered. For example, the codes generated will have the lengths in the following order: 1(62 times), 2(62 times) and so on.

    The performance is quite good, since the same code will be repeated only after the integer overflow limit, which is quite large.

    In this case also, the next code generated could be predicted by the use of some calculations.
     */

    public class Codec2 {
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<String, String> map = new HashMap<>();
        int count = 1;

        public String getString() {
            int c = count;
            StringBuilder sb = new StringBuilder();
            while (c > 0) {
                c--;
                sb.append(chars.charAt(c % 62));
                c /= 62;
            }
            return sb.toString();
        }

        public String encode(String longUrl) {
            String key = getString();
            map.put(key, longUrl);
            count++;
            return "http://tinyurl.com/" + key;
        }

        public String decode(String shortUrl) {
            return map.get(shortUrl.replace("http://tinyurl.com/", ""));
        }
    }

 	/*
 	Approach #3 Using hashcode

    Performance Analysis

    The number of URLs that can be encoded is limited by the range of int, since hashCode uses integer calculations.

    The average length of the encoded URL isn't directly related to the incoming longURL length.

    The hashCode() doesn't generate unique codes for different string. This property of getting the same code for two different inputs is called collision. Thus, as the number of encoded URLs increases, the probability of collisions increases, which leads to failure.

    The following figure demonstrates the mapping of different objects to the same hashcode and the increasing probability of collisions with increasing number of objects.
 	 */

    public class Codec3 {
        Map<Integer, String> map = new HashMap<>();

        public String encode(String longUrl) {
            map.put(longUrl.hashCode(), longUrl);
            return "http://tinyurl.com/" + longUrl.hashCode();
        }

        public String decode(String shortUrl) {
            return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
        }
    }

    /*
    Approach #4 Using random number

	Performance Analysis

    The number of URLs that can be encoded is limited by the range of int.

    The average length of the codes generated is independent of the longURL's length, since a random integer is used.

    The length of the URL isn't necessarily shorter than the incoming longURL. It is only dependent on the relative order in which the URLs are encoded.

    Since a random number is used for coding, again, as in the previous case, the number of collisions could increase with the increasing number of input strings, leading to performance degradation.

    Determining the encoded URL isn't possible in this scheme, since we make use of random numbers.
     */

    public class Codec5 {
        Map<Integer, String> map = new HashMap<>();
        Random r = new Random();
        int key = r.nextInt(Integer.MAX_VALUE);

        public String encode(String longUrl) {
            while (map.containsKey(key)) {
                key = r.nextInt(Integer.MAX_VALUE);
            }
            map.put(key, longUrl);
            return "http://tinyurl.com/" + key;
        }

        public String decode(String shortUrl) {
            return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
        }
    }

    /*
    Approach #5 Random fixed-length encoding

	Performance Analysis

    The number of URLs that can be encoded is quite large in this case, nearly of the order (10+26∗2)^6.

    The length of the encoded URLs is fixed to 6 units, which is a significant reduction for very large URLs.

    The performance of this scheme is quite good, due to a very less probability of repeated same codes generated.

    We can increase the number of encodings possible as well, by increasing the length of the encoded strings. Thus, there exists a tradeoff between the length of the code and the number of encodings possible.

    Predicting the encoding isn't possible in this scheme since random numbers are used.
     */

    public class Codec6 {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<String, String> map = new HashMap<>();
        Random rand = new Random();
        String key = getRand();

        public String getRand() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(alphabet.charAt(rand.nextInt(62)));
            }
            return sb.toString();
        }

        public String encode(String longUrl) {
            while (map.containsKey(key)) {
                key = getRand();
            }
            map.put(key, longUrl);
            return "http://tinyurl.com/" + key;
        }

        public String decode(String shortUrl) {
            return map.get(shortUrl.replace("http://tinyurl.com/", ""));
        }
    }
}


