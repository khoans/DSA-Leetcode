package web_crawler;

import java.util.*;

public class BreadthFirstSearch {
    class Solution {
        private String getHostname(String url) {
            // split url by slashes
            // for instance, "http://example.org/foo/bar" will be split into
            // "http:", "", "example.org", "foo", "bar"
            // the hostname is the 2-nd (0-indexed) element
            return url.split("/")[2];
        }

        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            String startHostname = getHostname(startUrl);
            Queue<String> q = new LinkedList<String>(Arrays.asList(startUrl));
            HashSet<String> visited = new HashSet<String>(Arrays.asList(startUrl));
            while (!q.isEmpty()) {
                String url = q.remove();
                for (String nextUrl : htmlParser.getUrls(url)) {
                    if (getHostname(nextUrl).equals(startHostname) && !visited.contains(nextUrl)) {
                        q.add(nextUrl);
                        visited.add(nextUrl);
                    }
                }
            }
            return new ArrayList<>(visited);
        }
    }
}

/*
Complexity Analysis
Let n be the total number of URLs (urls.length), m be the number of edges in the graph, and l be the maximum length of a URL (urls[i].length).

Time complexity: O(m⋅l).
Let k be the number of traversed vertices. We add each of these vertices to the set and to the queue in up to O(l) per vertex. The total time for inserting into the set and into the queue is thus O(k⋅l).

The most time-consuming part is calling htmlParser.getUrls(url) to get the edges outgoing from url and iterating over all nextUrl. When processing nextUrl, we call getHostname(nextUrl) and search nextUrl in the hash set. Both of these can take O(nextUrl.length)=O(l) time. The complexity equals the sum of all the O(l) work done.

The total number of elements in htmlParser.getUrls(url) over all URLs is m – the total number of edges in the graph. Each element can have a length of O(l). The sum of lengths of the elements of htmlParser.getUrls(url) over all URLs is O(m⋅l).

The total complexity is O(k⋅l+m⋅l). Since k=O(m), we can simplify this expression to O(m⋅l).

Space complexity: O(n⋅l).
For each visited url, we call htmlParser.getUrls(url) and store its return value. For one url, htmlParser.getUrls(url) contains O(n) elements (in the worst case, there are edges from the url to all other vertices), each having a length up to O(l). The total length of the elements of htmlParser.getUrls(url) for one url could therefore be O(n⋅l). Unlike in the previous approach, we do not store them simultaneously for all vertices, but only for one vertex at a time.

The total length of the queue elements does not exceed the total length of all URLs – O(n⋅l).

So the total space complexity is O(n⋅l).
* */
