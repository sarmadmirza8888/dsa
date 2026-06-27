/*
 * ------------------------------------------------------------
 * Problem    : 226. Invert Binary Tree
 * File       : InvertBinaryTreeBrute.java
 * Approach   : Brute Force (Iterative BFS using Queue)
 *
 * Description:
 * Traverse the binary tree level by level using a Queue.
 * At each node, swap its left and right child.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.LinkedList;
import java.util.Queue;
class InvertBinaryTreeBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            // Swap children
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }
        return root;
    }
    // Inorder Traversal
    static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        InvertBinaryTreeBrute solution = new InvertBinaryTreeBrute();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.print("Before Inversion : ");
        inorder(root);
        solution.invertTree(root);
        System.out.print("\nAfter Inversion  : ");
        inorder(root);
    }
}