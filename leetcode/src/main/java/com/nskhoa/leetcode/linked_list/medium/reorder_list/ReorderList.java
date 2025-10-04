package com.nskhoa.leetcode.linked_list.medium.reorder_list;

import com.nskhoa.common.ListNode;

/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.



Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]


Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 * */
public class ReorderList {
    /*
    Complexity Analysis

Time complexity: O(N). There are three steps here. To identify the middle node takes O(N) time. To reverse the second part of the list, one needs N/2 operations. The final step, to merge two lists, requires N/2 operations as well. In total, that results in O(N) time complexity.

Space complexity: O(1), since we do not allocate any additional data structures.
    * */
    class Solution {
        public void reorderList(ListNode head) {
            if (head == null) {
                return;
            }

            // find the middle of linked list [Problem 876]
            // in 1->2->3->4->5->6 find 4
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // reverse the second part of the list [Problem 206]
            // convert 1->2->3->4->5->6 into 1->2->3->4 and 6->5->4
            // reverse the second half in-place
            ListNode prev = null, curr = slow, tmp;
            while (curr != null) {
                tmp = curr.next;

                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            // merge two sorted linked lists [Problem 21]
            // merge 1->2->3->4 and 6->5->4 into 1->6->2->5->3->4
            ListNode first = head, second = prev;
            while (second.next != null) {
                tmp = first.next;
                first.next = second;
                first = tmp;

                tmp = second.next;
                second.next = first;
                second = tmp;
            }
        }
    }

    class Solution2 {
        public void reorderList(ListNode head) {
            if (head == null) {
                return;
            }

            // Step 1: Find the middle of the linked list
            ListNode middle = findMiddle(head);

            // Step 2: Reverse the second half of the list
            ListNode secondHalf = reverseList(middle);

            // Step 3: Merge the two halves
            mergeLists(head, secondHalf);
        }

        // Helper to find the middle node (Problem 876)
        private ListNode findMiddle(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Helper to reverse a linked list (Problem 206)
        private ListNode reverseList(ListNode head) {
            ListNode prev = null, curr = head, tmp;
            while (curr != null) {
                tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }
            return prev;
        }

        // Helper to merge two lists as per reorder requirement
        private void mergeLists(ListNode first, ListNode second) {
            ListNode tmp1, tmp2;
            while (second.next != null) {
                tmp1 = first.next;
                first.next = second;
                first = tmp1;

                tmp2 = second.next;
                second.next = first;
                second = tmp2;
            }
        }
    }


    public static void main(String[] args) {
        Solution solution = new ReorderList().new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        solution.reorderList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
