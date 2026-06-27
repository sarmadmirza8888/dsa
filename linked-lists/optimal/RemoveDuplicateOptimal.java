/*
 * ------------------------------------------------------------
 * Problem    : 83. Remove Duplicates from Sorted List
 * File       : RemoveDuplicatesOptimal.java
 * Approach   : Optimal (Single Pointer)
 *
 * Description:
 * Traverse the sorted linked list once.
 * If two consecutive nodes have the same value,
 * skip the duplicate node.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class RemoveDuplicatesOptimal {
    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode current = head;
        while (current != null && current.next != null) {
            // Duplicate found
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
    // Print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RemoveDuplicatesOptimal solution = new RemoveDuplicatesOptimal();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        System.out.print("Original List : ");
        printList(head);
        head = solution.deleteDuplicates(head);
        System.out.print("Updated List  : ");
        printList(head);
    }
}