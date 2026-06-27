/*
 * ------------------------------------------------------------
 * Problem    : 226. Invert Binary Tree
 * File       : InvertBinaryTreeOptimal.java
 * Approach   : Optimal (Recursive DFS)
 *
 * Description:
 * Recursively invert the left and right subtrees.
 * Swap the left and right child of every node.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class InvertBinaryTreeOptimal {
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
        // Swap children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recursively invert subtrees
        invertTree(root.left);
        invertTree(root.right);
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
        InvertBinaryTreeOptimal solution = new InvertBinaryTreeOptimal();
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