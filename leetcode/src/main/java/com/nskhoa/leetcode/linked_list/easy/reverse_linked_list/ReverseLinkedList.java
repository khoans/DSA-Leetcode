package com.nskhoa.leetcode.linked_list.easy.reverse_linked_list;

import com.nskhoa.common.ListNode;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
* */
public class ReverseLinkedList {
    /*
    Complexity analysis

Time complexity : O(n).
Assume that n is the list's length, the time complexity is O(n).

Space complexity : O(1).
     * */
    class Solution {
        public ListNode reverseList(ListNode head) {
            //prev curr next
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = solution.reverseList(head);
//        printList(reversedHead); // Output: 5 -> 4 -> 3 -> 2 -> 1
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}
