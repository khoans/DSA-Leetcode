package com.nskhoa.leetcode.array.easy.time_needed_to_buy_ticket;

import java.util.LinkedList;
import java.util.Queue;

/*
There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.



Example 1:

Input: tickets = [2,3,2], k = 2

Output: 6

Explanation:

The queue starts as [2,3,2], where the kth person is underlined.
After the person at the front has bought a ticket, the queue becomes [3,2,1] at 1 second.
Continuing this process, the queue becomes [2,1,2] at 2 seconds.
Continuing this process, the queue becomes [1,2,1] at 3 seconds.
Continuing this process, the queue becomes [2,1] at 4 seconds. Note: the person at the front left the queue.
Continuing this process, the queue becomes [1,1] at 5 seconds.
Continuing this process, the queue becomes [1] at 6 seconds. The kth person has bought all their tickets, so return 6.
Example 2:

Input: tickets = [5,1,1,1], k = 0

Output: 8

Explanation:

The queue starts as [5,1,1,1], where the kth person is underlined.
After the person at the front has bought a ticket, the queue becomes [1,1,1,4] at 1 second.
Continuing this process for 3 seconds, the queue becomes [4] at 4 seconds.
Continuing this process for 4 seconds, the queue becomes [] at 8 seconds. The kth person has bought all their tickets, so return 8.


Constraints:

n == tickets.length
1 <= n <= 100
1 <= tickets[i] <= 100
0 <= k < n
 * */
public class TimeNeededToBuyTicket {
    /*
    Approach: Iterate through each person in the tickets array.
    Time Complexity: O(n)
    Space Complexity: O(1)
    * */
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int time = 0;

            for (int i = 0; i < tickets.length; i++) {
                // If the current person is before or at the desired person 'k'
                if (i <= k) {
                    // Buy the minimum of tickets available at person 'k' and the current person
                    time += Math.min(tickets[k], tickets[i]);
                }
                else {
                    // If the current person is after 'k', buy the minimum of
                    // (tickets available at person 'k' - 1) and the current person
                    time += Math.min(tickets[k] - 1, tickets[i]);
                }
            }

            return time;
        }
    }

    /*
    Complexity Analysis
Let n be the length of the tickets array and m be the maximum number of tickets at each index.

Time complexity: O(n⋅m)

The outer while loop continues until the person at position k buys all of their tickets. The inner for loop iterates through all people in the tickets array. So, the overall time complexity is O(n⋅m).

Space complexity: O(1)

The space complexity is O(1) as the algorithm uses only a constant amount of extra space.
    * */
    class Solution2 {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int n = tickets.length;
            int time = 0;

            // If person k only needs one ticket, return the time to buy it
            if (tickets[k] == 1) {
                return k + 1;
            }

            // Continue buying tickets until person k buys all their tickets
            while (tickets[k] > 0) {
                for (int i = 0; i < n; i++) {
                    // Buy a ticket at index 'i' if available
                    if (tickets[i] != 0) {
                        tickets[i]--;
                        time++;
                    }

                    // If person k bought all their rickets, return the time
                    if (tickets[k] == 0) {
                        return time;
                    }
                }
            }

            return time;
        }
    }

    /*
    Approach: Use a queue to simulate the ticket buying process.
    Time Complexity: O(n * m)
    Space Complexity: O(n)
    * */
    class Solution3 {
        public int timeRequiredToBuy(int[] tickets, int k) {
            Queue<Integer> queue = new LinkedList<>();

            // Initialize the queue with ticket indices
            for (int i = 0; i < tickets.length; i++) {
                queue.add(i);
            }

            int time = 0;

            // Loop until the queue is empty
            while (!queue.isEmpty()) {
                // Increment the time counter for each iteration
                time++;

                // Get the front element of the queue
                int front = queue.poll();

                // Buy a ticket for the front person
                tickets[front]--;

                // If person k bought all their tickets, return time
                if (k == front && tickets[front] == 0) {
                    return time;
                }

                // Re-add the current index to the queue for the next iteration
                if (tickets[front] != 0) {
                    queue.add(front);
                }
            }

            return time;
        }
    }

    public static void main(String[] args) {
        Solution solution = new TimeNeededToBuyTicket().new Solution();
        int[] tickets = {2, 3, 6, 5, 2};
        int k = 2;
        int result = solution.timeRequiredToBuy(tickets, k);
        System.out.println(result); // Output: 6
    }
}
