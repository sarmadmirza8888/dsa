/*
 * ------------------------------------------------------------
 * Problem    : 141. Linked List Cycle
 * File       : LinkedListCycleOptimal.java
 * Approach   : Optimal (Floyd's Cycle Detection)
 *
 * Description:
 * Use two pointers:
 * Slow pointer moves one node at a time.
 * Fast pointer moves two nodes at a time.
 * If they meet, a cycle exists.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

class HasCycleOptimal {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycleOptimal solution = new LinkedListCycleOptimal();
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