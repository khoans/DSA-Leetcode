package com.nskhoa.leetcode.linked_list.easy.linked_list_cycle;

import com.nskhoa.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

Follow up: Can you solve it using O(1) (i.e. constant) memory?
 * */
public class LinkedListCycle {
    /*
    Complexity analysis

Let n be the total number of nodes in the linked list.

Time complexity : O(n).
We visit each of the n elements in the list at most once. Adding a node to the hash table costs only O(1) time.

Space complexity: O(n).
The space depends on the number of elements added to the hash table, which contains at most n elements.
    * */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> nodesSeen = new HashSet<>();
            ListNode current = head;
            while (current != null) {
                if (nodesSeen.contains(current)) {
                    return true;
                }
                nodesSeen.add(current);
                current = current.next;
            }
            return false;
        }
    }

    /*
    Complexity analysis

Time complexity : O(n).
Let us denote n as the total number of nodes in the linked list. To analyze its time complexity, we consider the following two cases separately.

List has no cycle:
The fast pointer reaches the end first and the run time depends on the list's length, which is O(n).

List has a cycle:
We break down the movement of the slow pointer into two steps, the non-cyclic part and the cyclic part:

The slow pointer takes "non-cyclic length" steps to enter the cycle. At this point, the fast pointer has already reached the cycle. Number of iterations=non-cyclic length=N

Both pointers are now in the cycle. Consider two runners running in a cycle - the fast runner moves 2 steps while the slow runner moves 1 steps at a time. Since the speed difference is 1, it takes
difference of speed
distance between the 2 runners
​
  loops for the fast runner to catch up with the slow runner.As the distance is at most cyclic length K - 1 and the speed difference is 1, we conclude that
Number of iterations=at most cyclic length K - 1.

Therefore, the worst case time complexity is O(N+K), which is O(n).

Space complexity : O(1).
We only use two nodes (slow and fast) so the space complexity is O(1).
     * */
    public class Solution2 {
        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle here
        System.out.println(solution.hasCycle(head)); // true
    }
}
