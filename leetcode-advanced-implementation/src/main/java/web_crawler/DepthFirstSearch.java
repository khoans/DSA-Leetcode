package web_crawler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Given a url startUrl and an interface HtmlParser, implement a web crawler to crawl all links that are under the same hostname as startUrl.

Return all urls obtained by your web crawler in any order.

Your crawler should:

Start from the page: startUrl
Call HtmlParser.getUrls(url) to get all urls from a webpage of given url.
Do not crawl the same link twice.
Explore only the links that are under the same hostname as startUrl.


As shown in the example url above, the hostname is example.org. For simplicity sake, you may assume all urls use http protocol without any port specified. For example, the urls http://leetcode.com/problems and http://leetcode.com/contest are under the same hostname, while urls http://example.org/test and http://example.com/abc are not under the same hostname.

The HtmlParser interface is defined as such:

interface HtmlParser {
  // Return a list of all urls from a webpage of given url.
  public List<String> getUrls(String url);
}
Below are two examples explaining the functionality of the problem, for custom testing purposes you'll have three variables urls, edges and startUrl. Notice that you will only have access to startUrl in your code, while urls and edges are not directly accessible to you in code.

Note: Consider the same URL with the trailing slash "/" as a different URL. For example, "http://news.yahoo.com", and "http://news.yahoo.com/" are different urls.



Example 1:



Input:
urls = [
  "http://news.yahoo.com",
  "http://news.yahoo.com/news",
  "http://news.yahoo.com/news/topics/",
  "http://news.google.com",
  "http://news.yahoo.com/us"
]
edges = [[2,0],[2,1],[3,2],[3,1],[0,4]]
startUrl = "http://news.yahoo.com/news/topics/"
Output: [
  "http://news.yahoo.com",
  "http://news.yahoo.com/news",
  "http://news.yahoo.com/news/topics/",
  "http://news.yahoo.com/us"
]
Example 2:



Input:
urls = [
  "http://news.yahoo.com",
  "http://news.yahoo.com/news",
  "http://news.yahoo.com/news/topics/",
  "http://news.google.com"
]
edges = [[0,2],[2,1],[3,2],[3,1],[3,0]]
startUrl = "http://news.google.com"
Output: ["http://news.google.com"]
Explanation: The startUrl links to all other pages that do not share the same hostname.


Constraints:

1 <= urls.length <= 1000
1 <= urls[i].length <= 300
startUrl is one of the urls.
Hostname label must be from 1 to 63 characters long, including the dots, may contain only the ASCII letters from 'a' to 'z', digits  from '0' to '9' and the hyphen-minus character ('-').
The hostname may not start or end with the hyphen-minus character ('-').
See:  https://en.wikipedia.org/wiki/Hostname#Restrictions_on_valid_hostnames
You may assume there're no duplicates in url library.
* */
public class DepthFirstSearch {
    class Solution {
        private String startHostname;
        private HashSet<String> visited = new HashSet<String>();

        private String getHostname(String url) {
            // split url by slashes
            // for instance, "http://example.org/foo/bar" will be split into
            // "http:", "", "example.org", "foo", "bar"
            // the hostname is the 2-nd (0-indexed) element
            return url.split("/")[2];
        }

        private void dfs(String url, HtmlParser htmlParser) {
            visited.add(url);
            for (String nextUrl : htmlParser.getUrls(url)) {
                if (getHostname(nextUrl).equals(startHostname) && !visited.contains(nextUrl)) {
                    dfs(nextUrl, htmlParser);
                }
            }
        }

        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            startHostname = getHostname(startUrl);
            dfs(startUrl, htmlParser);
            return new ArrayList<>(visited);
        }
    }
}

/*
Complexity Analysis
Let m be the number of edges in the graph, and l be the maximum length of a URL (urls[i].length).

Time complexity: O(m⋅l).
Let k be the number of traversed vertices. We add all these nodes to the set, with each node costing up to O(l). The total time for inserting into the set is thus O(k⋅l).

The most time-consuming part in the dfs is calling htmlParser.getUrls(url) to get the edges outgoing from url and iterating over all nextUrl. When processing nextUrl, we call getHostname(nextUrl) and search nextUrl in the hash set. Both of these can take O(nextUrl.length)=O(l) time. The complexity equals the sum of all the O(l) work done.

The total number of elements in htmlParser.getUrls(url) over all URLs is m – the total number of edges in the graph. Each element can have a length of O(l). The sum of lengths of the elements of htmlParser.getUrls(url) over all URLs is O(m⋅l).

The total complexity is O(k⋅l+m⋅l). Since k=O(m), we can simplify this expression to O(m⋅l).

Space complexity: O(m⋅l).
At each recursion level, we simultaneously store the return value of htmlParser.getUrls(url). As mentioned above, the total length of these is O(m⋅l). We also use a set to store the answer, which can grow to this size. While you usually don't include the answer as part of the space complexity, the set is also functional - it prevents us from visiting a URL more than once.
* */
