/*
 * ------------------------------------------------------------
 * Problem    : 21. Merge Two Sorted Lists
 * File       : MergeTwoSortedListsOptimal.java
 * Approach   : Optimal (Two Pointer Merge)
 *
 * Description:
 * Compare the current nodes of both linked lists.
 * Always attach the smaller node to the merged list.
 * Continue until one list finishes, then attach the
 * remaining nodes of the other list.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class MergeTwoSortedListsOptimal {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        // Attach remaining nodes
        if (list1 != null)
            tail.next = list1;
        if (list2 != null)
            tail.next = list2;
        return dummy.next;
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
        MergeTwoSortedListsOptimal solution = new MergeTwoSortedListsOptimal();
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