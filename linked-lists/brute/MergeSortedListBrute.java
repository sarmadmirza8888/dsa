/*
 * ------------------------------------------------------------
 * Problem    : 21. Merge Two Sorted Lists
 * File       : MergeTwoSortedListsBrute.java
 * Approach   : Brute Force (Collect → Sort → Rebuild)
 *
 * Description:
 * Store all nodes from both linked lists into an ArrayList.
 * Sort the ArrayList.
 * Build a new sorted linked list from the sorted values.
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.Collections;
class MergeTwoSortedListsBrute {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        // Copy first list
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        // Copy second list
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }
        if (list.isEmpty())
            return null;
        // Sort all values
        Collections.sort(list);
        // Build new linked list
        ListNode head = new ListNode(list.get(0));
        ListNode tail = head;
        for (int i = 1; i < list.size(); i++) {
            tail.next = new ListNode(list.get(i));
            tail = tail.next;
        }
        return head;
    }
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
        MergeTwoSortedListsBrute solution = new MergeTwoSortedListsBrute();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode merged = solution.mergeTwoLists(list1, list2);
        printList(merged);
    }
}