package com.nskhoa.leetcode.array.easy.merge_sorted_list;

/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.




Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

import java.util.LinkedList;

public class MergeSortedList
{
    /*
    Approach 1: Recursion
    Time complexity : O(n+m)

	Because each recursive call increments the pointer to list1 or list2 by one (approaching the dangling null at the
	end of
	 each list), there will be exactly one call to mergeTwoLists per element in each list. Therefore, the time complexity is linear in the combined size of the lists.

	Space complexity : O(n+m)

	The first call to mergeTwoLists does not return until the ends of both list1 and list2 have been reached, so n+m
	stack
	frames consume O(n+m) space.
     */

    public ListNode mergeTwoListsRecusive(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecusive(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecusive(list1, list2.next);
            return list2;
        }
    }


    /*
    Approach 2: Iteration
    Time complexity : O(n+m)

	Because exactly one of list1 and list2 is incremented on each loop iteration, the while loop runs for a number of
	iterations equal to the sum of the lengths of the lists. All other work is constant, so the overall complexity is
	 linear.

	Space complexity : O(1)

	The iterative approach only allocates a few pointers, so it has a constant overall memory footprint.
     */

    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        // At least one of list1 and list2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = list1 == null ? list2 : list1;

        return prehead.next;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    private static class ListNode {
        int val;
        ListNode next;

        // Constructor
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
