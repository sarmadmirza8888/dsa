/*
 * ------------------------------------------------------------
 * Problem    : 141. Linked List Cycle
 * File       : LinkedListCycleBrute.java
 * Approach   : Brute Force (HashSet)
 *
 * Description:
 * Traverse the linked list while storing each visited node
 * in a HashSet. If a node is encountered again, a cycle
 * exists in the linked list.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

import java.util.HashSet;

class HasCycleBrute {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            // If node already exists, cycle found
            if (visited.contains(current)) {
                return true;
            }
            // Store current node
            visited.add(current);
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycleBrute solution = new LinkedListCycleBrute();
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        // Create cycle
        fourth.next = second;
        System.out.println(solution.hasCycle(first));
    }
}