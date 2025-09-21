package com.nskhoa.leetcode.linked_list.medium.swap_nodes_in_pairs;

import com.nskhoa.common.ListNode;

/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)



Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:



Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]



Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100
 * */
public class SwapNodeInPairs {
    /*
    Complexity Analysis

Time Complexity : O(N) where N is the size of the linked list.

Space Complexity : O(1).
     * */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            // Dummy node acts as the prevNode for the head node
            // of the list and hence stores pointer to the head node.
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode prevNode = dummy;

            while ((head != null) && (head.next != null)) {
                // Nodes to be swapped
                ListNode firstNode = head;
                ListNode secondNode = head.next;

                // Swapping
                prevNode.next = secondNode; // perserve the linkage ... affects dummy
                firstNode.next = secondNode.next;//skips two ... affects head
                secondNode.next = firstNode;// reverse two ... affects head

                // Reinitializing the head and prevNode for next swap
                prevNode = firstNode;// assignment does not mutate the list - it just changes which node you are referring to it does not change dummy itself it just moves prevNode to point to a new node firstNode. dummy still points to the startof the list and isn't alterned

                head = firstNode.next; // jump
            }

            // Return the new head node.
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SwapNodeInPairs().new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = solution.swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
