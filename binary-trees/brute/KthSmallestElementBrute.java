/*
 * ------------------------------------------------------------
 * Problem    : 230. Kth Smallest Element in a BST
 * File       : KthSmallestElementBrute.java
 * Approach   : Brute Force (Recursive Inorder Traversal)
 *
 * Description:
 * Perform an inorder traversal of the BST and store all
 * values in an ArrayList. Since inorder traversal of a BST
 * is sorted, return the element at index (k-1).
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
class KthSmallestElementBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k - 1);
    }
    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        KthSmallestElementBrute solution = new KthSmallestElementBrute();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        System.out.println(solution.kthSmallest(root, k));
    }
}