/*
 * ------------------------------------------------------------
 * Problem    : 83. Remove Duplicates from Sorted List
 * File       : RemoveDuplicatesBrute.java
 * Approach   : Brute Force (Convert → Remove Duplicates → Rebuild)
 *
 * Description:
 * Copy all values from the linked list into an ArrayList.
 * Remove duplicate values from the ArrayList.
 * Build a new linked list from the unique values.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
class RemoveDuplicatesBrute {
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
        // Store unique values
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            if (list.isEmpty() || list.get(list.size() - 1) != current.val) {
                list.add(current.val);
            }
            }
            current = current.next;
        }
        // Rebuild linked list
        ListNode newHead = new ListNode(list.get(0));
        ListNode tail = newHead;
        for (int i = 1; i < list.size(); i++) {
            tail.next = new ListNode(list.get(i));
            tail = tail.next;
        }
        return newHead;
    }
    // Print linked list
    static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null){
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RemoveDuplicatesBrute solution = new RemoveDuplicatesBrute();
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